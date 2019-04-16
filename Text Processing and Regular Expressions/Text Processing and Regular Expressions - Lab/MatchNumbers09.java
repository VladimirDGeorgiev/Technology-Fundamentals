package TextProcessingandRegularExpressions.Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNumbers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "((^|(?<=\\s)))-?\\d+(\\.\\d+)?($|(?=\\s))";
        String numbers = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numbers);

        List<String> result = new LinkedList<>();
        while (matcher.find()){
            result.add(matcher.group());
        }
        System.out.println(String.join(" ", result));
    }
}
