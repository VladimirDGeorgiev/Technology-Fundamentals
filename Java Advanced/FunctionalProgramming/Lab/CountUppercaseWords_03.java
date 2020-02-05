package FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split("\\s+");
        List<String> uppercaseWords = new ArrayList<>();
        Predicate<String> isUpper = word -> word.charAt(0)==word.toUpperCase().charAt(0);

        for (String word : data) {
            if (isUpper.test(word)){
                uppercaseWords.add(word);
            }
        }

        System.out.println(uppercaseWords.size());
        for (String uppercaseWord : uppercaseWords) {
            System.out.println(uppercaseWord);
        }
    }
}
