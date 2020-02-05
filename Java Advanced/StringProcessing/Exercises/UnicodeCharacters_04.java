package StringProcessing.Exercises;

import java.util.Scanner;

public class UnicodeCharacters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();

        for (int i = 0; i < inputWord.length(); i++) {
            System.out.print(toUnicode(inputWord.charAt(i)));
        }
    }
    private static String toUnicode(char ch) {
        return String.format("\\u%04x", (int) ch);
    }
}
