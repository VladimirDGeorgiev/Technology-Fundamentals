package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p07FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>,Integer> smallestElement = n->{
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < n.size(); i++) {
                if (min>=n.get(i)){
                    min=n.get(i);
                    index=i;
                }
            }
            return index;
        };
        System.out.println(smallestElement.apply(numbers));
    }
}
