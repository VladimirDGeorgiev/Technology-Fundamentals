package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class p09ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        BiPredicate<int[],Integer> isItDivisible = (a,b)->{
            for (int e : a) {
                if (b%e!=0){
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <=n ; i++) {
            if (isItDivisible.test(numbers,i)) {
                System.out.print(i + " ");
            }
        }
    }
}
