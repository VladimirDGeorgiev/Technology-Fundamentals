package JavaOOp.IteratorsAndComparators.Exercises.StackIterator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class MyStack<T> implements Iterable<T> {
    private final int INITIAL_CAPACITY = 16;
    private final String NO_SUCH_ELEMENT_EXEPTION_MESEGE = "No elements";
    private T[] elements ;
    private int elementCount;

    @SuppressWarnings("unchecked")
    public  MyStack() {
        this.elements=(T[])(new  Integer[INITIAL_CAPACITY]);
    }
    private void growElementLenght(){
        this.elements = Arrays.copyOf(this.elements,this.elements.length*2);
    }

    public void push(T element) {
        if (this.elementCount==this.elements.length){
            growElementLenght();
        }
        this.elements[this.elementCount++]=element;
    }

    public T pop() {
        if (elementCount<=0){

            throw new NoSuchElementException(NO_SUCH_ELEMENT_EXEPTION_MESEGE);
        }
        this.elements[elementCount-1] = null;
        return this.elements[--elementCount];
    }



    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    public final class StackIterator implements Iterator<T> {
        private int index;

        StackIterator() {
            this.index = elementCount-1;
        }

        @Override
        public boolean hasNext() {
            return this.index>=0;
        }

        @Override
        public T next() {
            return elements[this.index--];
        }
    }

}
