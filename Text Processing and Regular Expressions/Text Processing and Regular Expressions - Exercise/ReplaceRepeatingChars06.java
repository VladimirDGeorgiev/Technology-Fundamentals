package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;

public class ReplaceRepeatingChars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String temp = "";
        String result = "";
        for (int i = 0; i <input.length() ; i++) {
            if (!temp.equals(String.valueOf(input.charAt(i)))){
            result+=input.charAt(i);
            temp=String.valueOf(input.charAt(i));
            }
        }
        System.out.println(result);
    }
}
