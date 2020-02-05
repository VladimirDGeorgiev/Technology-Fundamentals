package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class p01ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Consumer<String> printNames = System.out::println;
        String[] names = reader.readLine().split("\\s+");

        for (String name : names) {
                printNames.accept(name);
        }
    }
}
