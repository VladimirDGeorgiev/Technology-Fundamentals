package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class p03CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[],Integer> min = e-> {
            int minNum = Integer.MAX_VALUE;
            for (Integer integer : e) {
                if (minNum>integer){
                    minNum=integer;
                }
            }
            return minNum;
        };
        System.out.println(min.apply(numbers));

    }

}
