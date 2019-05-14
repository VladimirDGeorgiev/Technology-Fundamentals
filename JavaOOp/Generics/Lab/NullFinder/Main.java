package JavaOOp.Generics.Lab.NullFinder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings,null,"2",null,"4");
        List<Integer> indexsOfNull = ListUtils.getNullIndices(strings);
        for (Integer integer : indexsOfNull) {
            System.out.println(integer);
        }
    }
}
