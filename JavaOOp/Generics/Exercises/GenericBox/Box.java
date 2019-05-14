package JavaOOp.Generics.Exercises.GenericBox;

import java.lang.reflect.Type;

public class Box<T> {
    private T type;

    public Box(T type) {
        this.type = type;
    }

    @Override
    public String toString() {

        return type.getClass().getName()+": "+type;
    }
}
