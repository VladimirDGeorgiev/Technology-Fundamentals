package JavaOOp.Generics.Lab.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<String> jar = new Jar<>();

        jar.add("asd");
        jar.add("asd");
        jar.remove();
        System.out.println(jar.remove());

    }
}
