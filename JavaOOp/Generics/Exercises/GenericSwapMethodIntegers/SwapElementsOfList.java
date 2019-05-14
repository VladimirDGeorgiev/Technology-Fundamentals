package JavaOOp.Generics.Exercises.GenericSwapMethodIntegers;

import java.util.Collections;
import java.util.List;

public class SwapElementsOfList <T> {

    private T type;

    public SwapElementsOfList(T type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return type.getClass().getName()+": "+type;
    }

    public static <T> List<T>  swap(List<T> list,Integer index1,Integer index2){
        Collections.swap(list,index1,index2);
        return list;
    }
}
