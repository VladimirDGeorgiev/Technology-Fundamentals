package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class p06PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int lengthNames = Integer.parseInt(reader.readLine());
        String[] names = reader.readLine().split("\\s+");
        Predicate<String> isInRange = e->e.length()<=lengthNames;
        Consumer<String> print = System.out::println;
        Arrays.stream(names).filter(isInRange).forEach(print);
    }
}
