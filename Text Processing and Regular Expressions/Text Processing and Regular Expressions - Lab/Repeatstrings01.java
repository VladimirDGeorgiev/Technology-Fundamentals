package TextProcessingandRegularExpressions.Lab;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Repeatstrings01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length() ; j++) {
                result.append(input[i]);
            }
        }
        System.out.println(result);
    }
}
