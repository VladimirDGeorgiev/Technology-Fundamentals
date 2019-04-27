package StringProcessing.Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "[aeiouy]";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        int result = 0;
        while (matcher.find()){
            result++;
        }
        System.out.println("Vowels: "+result);
    }
}
