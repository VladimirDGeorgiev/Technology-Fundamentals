package TextProcessingandRegularExpressions.Lab;

import java.util.Scanner;

public class TextFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (int i = 0; i <banList.length ; i++) {
            String stars = "";
            for (int j = 0; j <banList[i].length() ; j++) {
                stars+="*";
            }
           text= text.replace(banList[i],stars);
        }
        System.out.println(text);
    }
}
