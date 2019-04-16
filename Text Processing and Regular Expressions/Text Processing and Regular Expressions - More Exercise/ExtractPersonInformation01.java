package TextProcessingandRegularExpressions.moreExers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "@(?<name>\\w+)\\|.*#(?<age>\\d+)\\*";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()){
                System.out.println(String.format("%s is %s years old.",matcher.group("name"),matcher.group("age")));
            }
        }
    }
}
