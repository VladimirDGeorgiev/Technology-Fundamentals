package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p05ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(numbers);
        int divisible = Integer.parseInt(reader.readLine());
        Predicate<Integer>  removesDivisible = n->n%divisible!=0;
        numbers.stream().filter(removesDivisible).forEach(n-> System.out.print(n+" "));
    }
}
