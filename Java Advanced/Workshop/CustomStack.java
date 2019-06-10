package JavaAdvance.Workshop;

import java.util.EmptyStackException;
import java.util.function.Consumer;

//    • void push(int element) – Adds the given element to the stack
//    • int pop() – Removes the last added element
//    • int peek() – Returns the last element in the stack without removing it
//    • void forEach(Consumer<Integer> consumer) – Goes through each of the elements in the stack

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[INITIAL_CAPACITY];
    }
    public void push(int element){
        this.add(element);
    }
    public int pop(){
        isStackEmpty();
        return this.remove(this.size-1);
    }
    public int peek(){
        isStackEmpty();
        return this.get(size-1);
    }




    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
            consumer.accept(this.data[i]);
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }
    private void isStackEmpty() {
        if (this.size==0){
            throw new EmptyStackException();
        }
    }
    private void add(int element) {
        if (this.size == capacity) {
            resize();
        }
        this.data[size++] = element;

    }

    private int get(int index) {
        checkBoundary(index);
        return this.data[index];
    }

    private int remove(int index) {
        checkBoundary(index);
        int element = this.data[index];
        shiftLeft(index);
        if (size < capacity / 4) {
            shrink();
        }
        return element;
    }

    private void add(int index, int element) {
        checkBoundary(index);
        if (this.size == capacity) {
            resize();
        }
        shiftRight(index);
        this.data[index] = element;
        this.size++;

    }

    private void shiftRight(int index) {
        for (int i = this.size; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }
    }

    private void shiftLeft(int index) {
        if (this.size - 1 - index >= 0) System.arraycopy(this.data, index + 1, this.data, index, this.size - 1 - index);
        this.data[this.size - 1] = 0;
        this.size--;
    }

    private void shrink() {
        this.capacity /= 2;
        int[] newData = new int[capacity];
        System.arraycopy(this.data, 0, newData, 0, newData.length);
        this.data = newData;
    }


    private void checkBoundary(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index is out of Bounds");
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] newData = new int[capacity];
        System.arraycopy(this.data, 0, newData, 0, this.data.length);
        this.data = newData;
    }

}
