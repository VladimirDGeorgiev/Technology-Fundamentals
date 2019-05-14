package JavaOOp.Generics.Exercises.GenericBoxOFInteger;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            Box<?> nov = new Box<>(Integer.parseInt(reader.readLine()));
            System.out.println(nov.toString());
        }

    }
    public static class Box<T> {
        private T type;

        public Box(T type) {
            this.type = type;
        }

        @Override
        public String toString() {

            return type.getClass().getName()+": "+type;
        }
    }
}

