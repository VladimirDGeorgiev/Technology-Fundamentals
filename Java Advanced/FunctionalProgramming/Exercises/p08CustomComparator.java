package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p08CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(numbers);
        int[] result = new int[numbers.length];
        int index = 0;
        for (int number : numbers) {
            if (number%2==0){
                result[index++]=number;
            }
        }
        for (int number : numbers) {
            if (number%2!=0){
                result[index++]=number;
            }
        }
        Arrays.stream(result).forEach(e-> System.out.print(e+" "));
    }
}
