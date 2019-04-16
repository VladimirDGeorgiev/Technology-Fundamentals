package ExamPreparation;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] keys = scanner.nextLine().split(" ");

        String regex = "^[d-z#|\\}{]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            StringBuilder decriptedMassege = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                int temp = text.charAt(i) - 3;
                decriptedMassege.append(String.valueOf(Character.toChars(temp)));
            }
            String resultString = decriptedMassege.toString();
            resultString = resultString.replace(keys[0], keys[1]);
            System.out.println(resultString);
        }else{
            System.out.println("This is not the book you are looking for.");
        }
    }
}
