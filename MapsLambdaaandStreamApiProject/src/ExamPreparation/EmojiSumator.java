package ExamPreparation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data =scanner.nextLine().split(":");
        StringBuilder referentWord = new StringBuilder();
        for (String numbers : data) {

            referentWord.append(Character.toChars(Integer.parseInt(numbers)));
        }
        String regex = "(?<=\\s):([a-z]{4,}):(?=[\\,\\.\\?\\!]|\\s)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int counter = 0;
        int sumTotalEmojyPower = 0;
        List<String> resultList = new ArrayList<>();
        while (matcher.find()){
            String word = matcher.group(1);
        if (word.equals(referentWord.toString())){
            counter++;
        }
            for (int i = 0; i <word.length() ; i++) {
                sumTotalEmojyPower+=word.charAt(i);
            }
            resultList.add(":"+word+":");
        }
        for (int i = 0; i <counter ; i++) {
            sumTotalEmojyPower*=2;
        }
        if (!resultList.isEmpty()) {
            System.out.println(String.format("Emojis found: %s", resultList.toString().replaceAll("[\\[\\]]", "")));
        }
        System.out.println(String.format("Total Emoji Power: %d",sumTotalEmojyPower));

    }
}
