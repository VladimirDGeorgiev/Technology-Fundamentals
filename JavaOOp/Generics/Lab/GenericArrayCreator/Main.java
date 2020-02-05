package JavaOOp.Generics.Lab.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
    //    String[] str = ArrayCreator.create(10,"none");
        Integer[] integers = ArrayCreator.create(Integer.class,10,10);
     //   for (String s : str) {
       //     System.out.println(s);
      //  }
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
