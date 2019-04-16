package TextProcessingandRegularExpressions.Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String regex = "\\+359([- ]){1}2\\1\\d{3}\\1\\d{4}\\b";
         String string = scanner.nextLine();

         Pattern pattern = Pattern.compile(regex);
         Matcher matcher = pattern.matcher(string);
        List<String> result = new LinkedList<>();
        while (matcher.find()) {
           result.add(matcher.group());
        }
        System.out.println(String.join(", ",result));
    }
}
