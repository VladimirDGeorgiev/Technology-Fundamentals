package FunctionalProgramming.Lab;

import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numsArr = scanner.nextLine().split(", ");

        Function<String,Integer> parse = number -> Integer.parseInt(number);
        int sum = 0;
        for (String num : numsArr) {
            sum += parse.apply(num);

        }
        System.out.println("Count = "+numsArr.length);
        System.out.println("Sum = "+sum);

    }
}
