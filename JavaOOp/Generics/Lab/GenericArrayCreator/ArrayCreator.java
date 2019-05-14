package JavaOOp.Generics.Lab.GenericArrayCreator;


import java.lang.reflect.Array;

public class  ArrayCreator {
    public static <T> T[] create(int length, T item){
        T[] arr =(T[]) (new Object[length]);
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = item;
        }
        return (T[])arr;
    }
    public static <T> T[] create(Class<T> cl,T item, int lenght){
        T[] arr = (T[])  Array.newInstance(cl,lenght);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=item;
        }
        return arr;
    }
}
