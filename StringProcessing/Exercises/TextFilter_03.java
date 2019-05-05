package StringProcessing.Exercises;

import java.util.Scanner;

public class TextFilter_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banList = scanner.nextLine().split(", ");
        String inputText = scanner.nextLine();

        for (int i = 0; i < banList.length; i++) {
            StringBuilder pattern = new StringBuilder();
            for (int j = 0; j <banList[i].length() ; j++) {
                pattern.append("*");
            }
             inputText=inputText.replaceAll(banList[i],pattern.toString());
        }
        System.out.println(inputText);
    }
}
