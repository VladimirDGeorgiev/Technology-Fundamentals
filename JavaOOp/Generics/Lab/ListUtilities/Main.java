package JavaOOp.Generics.Lab.ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        //Collections.addAll(integers,1,2,3,4);
        Integer maxInteger = ListUtils.getMin(integers);
        System.out.println(maxInteger);
    }
}
