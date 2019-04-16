package TextProcessingandRegularExpressions.Lab;

import java.util.Scanner;

public class ReverseStrings03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end")){
            String result = "";
            for (int i = command.length()-1; i >=0; i--) {
                result+=command.charAt(i);
            }
            System.out.println(command+" = "+result);
            command = scanner.nextLine();
        }
    }
}
