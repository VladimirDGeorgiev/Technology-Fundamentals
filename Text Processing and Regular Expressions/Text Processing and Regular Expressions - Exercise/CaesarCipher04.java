package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;

public class CaesarCipher04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";

        for (int i = 0; i <input.length() ; i++) {

        int temp= input.charAt(i)+3;
        result+=(char)temp;
        }
        System.out.println(result);
    }
}
