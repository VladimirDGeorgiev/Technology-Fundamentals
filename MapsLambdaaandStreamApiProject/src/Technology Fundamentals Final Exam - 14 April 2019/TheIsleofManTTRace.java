package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheIsleofManTTRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^([\\#\\$\\%\\*\\&])(?<name>[a-zA-Z]+)\\1=(?<Length>[\\d]+)!!(?<Encrypted>.+)$";
        Pattern pattern = Pattern.compile(regex);
        while (true){
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                int length = Integer.parseInt(matcher.group("Length"));
                String encryptedMassege = matcher.group("Encrypted");
                if (length == encryptedMassege.length()) {
                    StringBuilder result = new StringBuilder();
                    for (int i = 0; i < encryptedMassege.length(); i++) {
                        result.append((char) (encryptedMassege.charAt(i) + length));
                    }
                    System.out.println(String.format("Coordinates found! %s -> %s",
                            name, result));
                    return;
                } else {
                    System.out.println("Nothing found!");
                }
            }else{
                System.out.println("Nothing found!");
            }
        }
    }
}
