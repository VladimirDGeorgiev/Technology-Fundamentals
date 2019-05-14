package JavaOOp.IteratorsAndComparators.Lab;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }
    private final class LibIterator implements Iterator<Book>{
        private int count=0;

        @Override
        public boolean hasNext() {
            return count<books.length;
        }

        @Override
        public Book next() {
            return books[count++];
        }
    }
}
