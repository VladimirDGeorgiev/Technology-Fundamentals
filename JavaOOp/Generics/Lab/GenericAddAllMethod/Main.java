package JavaOOp.Generics.Lab.GenericAddAllMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers,1,2,3,4);
        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles,1.2,2.3,3.3,4.3);
        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged,integers,doubles);
        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest,jagged);
        dest.forEach(System.out::println);

    }
}
