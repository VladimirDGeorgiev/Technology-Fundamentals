package TextProcessingandRegularExpressions.Lab;

import java.util.Scanner;

public class DigitsLettersandOther05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String digits = "";
        String words = "";
        String symbols = "";

        for (int i = 0; i <input.length() ; i++) {
            if (Character.isDigit(input.charAt(i))){
                digits+=input.charAt(i)  ;
            }
            else if (Character.isAlphabetic(input.charAt(i))){
                words+=input.charAt(i);
            }
            else{
                symbols+=input.charAt(i);
            }
        }
        System.out.println(digits);
        System.out.println(words);
        System.out.println(symbols);
    }
}
