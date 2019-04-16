package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(^|(?<=\\s))([\\w\\-]{3,16})($|(?=,|\\s))";
        Pattern pattern = Pattern.compile(regex);
        Matcher username = pattern.matcher(text);
        while (username.find()){
            System.out.println(username.group());
        }
    }
}
