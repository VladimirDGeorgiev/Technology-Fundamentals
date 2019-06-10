package JavaAdvance.Workshop;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[INITIAL_CAPACITY];
    }

    public void add(int element) {
        if (this.size == capacity) {
            resize();
        }
        this.data[size++] = element;

    }

    public int get(int index) {
        checkBoundary(index);
        return this.data[index];
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

    public int remove(int index) {
        checkBoundary(index);
        int element = this.data[index];
        shiftLeft(index);
        if (size < capacity / 4) {
            shrink();
        }
        return element;
    }

    public void add(int index, int element) {
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
