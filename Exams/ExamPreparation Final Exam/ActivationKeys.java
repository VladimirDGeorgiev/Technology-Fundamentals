package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("&");
        List<String> finalResult = new ArrayList<>();


        String regex = "\\b[A-Za-z0-9]{16}\\b|\\b[A-Za-z0-9]{25}\\b";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < input.length; i++) {
            String word = input[i].toUpperCase();
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                if (word.length() == 16) {
                    StringBuilder result16 = new StringBuilder();

                    String first = word.substring(0, 4) + "-";
                    String second = word.substring(4, 8) + "-";
                    String third = word.substring(8, 12) + "-";
                    String four = word.substring(12);
                    result16.append(first).append(second).append(third).append(four);
                    for (int j = 0; j < result16.length(); j++) {
                        char symbol = result16.charAt(j);
                        if (Character.isDigit(symbol)) {
                            int newNumb = 9 - Integer.parseInt(String.valueOf(symbol));
                            result16.replace(j, j+1, String.valueOf(newNumb));
//                            result16.insert(j, newNumb);
                        }
                    }
                    finalResult.add(String.valueOf(result16));

                } else {
                    StringBuilder result25 = new StringBuilder();
                    String first = word.substring(0, 5) + "-";
                    String second = word.substring(5, 10) + "-";
                    String third = word.substring(10, 15) + "-";
                    String four = word.substring(15, 20) + "-";
                    String five = word.substring(20);
                    result25.append(first).append(second).append(third).append(four).append(five);
                    for (int j = 0; j < result25.length(); j++) {
                        char symbol = result25.charAt(j);
                        if (Character.isDigit(symbol)) {
                            int newNumb = 9 - Integer.parseInt(String.valueOf(symbol));
                            result25.replace(j, j+1, String.valueOf(newNumb));
                        }
                    }
                    finalResult.add(String.valueOf(result25));
                }
            }
        }
        String end = String.join(", ", finalResult);
        System.out.println(end);

    }
}
