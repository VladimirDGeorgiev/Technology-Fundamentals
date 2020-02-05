package JavaOOp.Generics.Exercises.CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;

public class ListCustom<T extends Comparable<T>> {
    private ArrayList<T> list;

    public ListCustom() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public void remove(int index) {
        this.list.remove(index);
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }

    public void swap(int index1, int index2) {
        Collections.swap(list, index1, index2);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : list) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return Collections.max(this.list);
    }

    public T getMin() {
        return Collections.min(this.list);
    }

    public void sort(){
        Collections.sort(this.list);
    }

    public String printList() {
        String output = "";
        int count = 0;
        for (T e : list) {
            if (count==list.size()){
                output += e;
                break;
            }else {
                output += e + String.format("%n");
            }
        }
        return output;
    }

}
