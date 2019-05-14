package JavaOOp.Generics.Lab.GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> data = new Scale<>(2,3);
        System.out.println(data.getHeavier());
    }
}
