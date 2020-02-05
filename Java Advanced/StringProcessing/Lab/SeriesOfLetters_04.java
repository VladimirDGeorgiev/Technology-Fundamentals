package StringProcessing.Lab;

import java.util.Scanner;

public class SeriesOfLetters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char temp = ' ';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (temp!=input.charAt(i)){
                result.append(String.valueOf(input.charAt(i)));
            }
            temp=input.charAt(i);
        }
        System.out.println(result.toString());
    }
}
