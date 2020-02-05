package JavaOOp.IteratorsAndComparators.Exercises.Collection;

import java.util.*;

public class ListyIterator implements Iterable{
    private List<String> elements;
    private int count=0;

    public ListyIterator(String... items) {
        this.elements = new ArrayList<>( Arrays.asList(items));
    }

    public boolean Move() {
        if (count == this.elements.size()) {
            return false;
        }
        count++;
        return true;
    }

    public void Print() {
        if (this.elements.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(count));
        }
    }

    public boolean HasNext() {
        return count != this.elements.size()-1;

    }

    @Override
    public Iterator iterator() {
        return new Listyiter();
    }
    private final class Listyiter implements Iterator{
        public Listyiter() {
        }

        private int count;
        @Override
        public boolean hasNext() {
            return count<elements.size();
        }

        @Override
        public Object next() {
            return elements.get(count++);
        }

    }
    public void PrintAll(){

        for (String element : elements) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

}
