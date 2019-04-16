package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();
        String[] input = inputLine.split("\\|");

        String regexWord = "\\b[A-Z][^\\s]+\\b";
        Pattern patternWord = Pattern.compile(regexWord);
        Matcher matcherWord = patternWord.matcher(input[2]);

        String regexLetters = "([\\#\\$\\%\\*\\&])([A-Z]+)\\1";
        Pattern patternLetters = Pattern.compile(regexLetters);
        Matcher matcherLetters = patternLetters.matcher(input[0]);
        String capitalLetters = "";

        while (matcherLetters.find()) {
            capitalLetters += matcherLetters.group(2);
        }

        String regexNumbers = "([0-9]{2}):([0|1][0-9])";
        Pattern patternNumbers = Pattern.compile(regexNumbers);
        Matcher matcherNumbers = patternNumbers.matcher(input[1]);
        Map<Character,Integer> registerValidWords = new LinkedHashMap<>();
        while (matcherNumbers.find()) {
            for (int i = 0; i < capitalLetters.length(); i++) {
                if (capitalLetters.charAt(i) == Integer.parseInt(matcherNumbers.group(1))) {
                    registerValidWords.putIfAbsent(capitalLetters.charAt(i),Integer.parseInt(matcherNumbers.group(2))+1);
                }
            }

        }
        while (matcherWord.find()){
            String curentWord = matcherWord.group();

            registerValidWords.forEach((key,value)->{
                if (curentWord.charAt(0)==key&&curentWord.length()==value){
                    System.out.println(curentWord);
                }
            });
        }
    }
}
