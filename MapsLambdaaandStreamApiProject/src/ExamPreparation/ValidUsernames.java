package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "[ ()\\\\\\/]*\\b([a-zA-z][\\w]{2,24})\\b[ ()\\\\\\/]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 1;
        String[] result = new String[2];
        String[] temp = new String[2];
        while (matcher.find()) {
            if (count == 1) {
                temp[0] = matcher.group(1);
            }
            if (count == 2) {
                temp[1] = matcher.group(1);
                result[0] = temp[0];
                result[1] = temp[1];
            }
            if (count > 2) {
                String temp1Totemp0 = temp[1];
                temp[0] = temp1Totemp0;
                temp[1] = matcher.group(1);
                int sumLenghtTemp = temp[0].length() + temp[1].length();
                int sumLenghtResult = result[0].length() + result[1].length();
                if (sumLenghtTemp > sumLenghtResult) {
                    result[0] = temp[0];
                    result[1] = temp[1];
                }
            }
            count++;
        }
            System.out.println(result[0]);
            System.out.println(result[1]);
    }
}
