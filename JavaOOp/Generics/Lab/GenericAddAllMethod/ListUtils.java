package JavaOOp.Generics.Lab.GenericAddAllMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils<T> {
    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        T max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        T min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min.compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static <T> List<Integer> getNullIndices(List<T> list) {
        if (list.size() == 0) throw new IllegalArgumentException();
        List<Integer> indexs = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                indexs.add(i);
            }
        }
        return indexs;
    }

    public static  <T> void flatten(List<? super T> destination, List<List<? extends T>> sorce) {
        for (List<? extends T> inner : sorce) {
            destination.addAll(inner);
        }
    }
    public static <T> void addAll(List<? super T> destination, List<? extends T> source){
        destination.addAll(source);
    }

}

