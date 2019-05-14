package JavaOOp.Generics.Exercises.GenericCountMethodDouble;

import java.util.List;

public class Box<T> {
    private T type;

    public Box(T type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return type.getClass().getName()+": "+type;
    }
    public static  <T extends Comparable<T>> Integer compare(List<T> list,T element){
        int count = 0;
        for (T e : list) {
            if (e.compareTo(element)>0){
                count++;
            }
        }
        return count;
    }

}
