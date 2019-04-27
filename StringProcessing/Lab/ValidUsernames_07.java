package StringProcessing.Lab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "^[\\w-]{3,16}$";
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> result = new ArrayList<>();
        while (!input.equals("END")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                result.add("valid");
               // System.out.println("valid");
            }else{
                result.add("invalid");
              //  System.out.println("invalid");
            }
            input = scanner.nextLine();

        }
        if (result.contains("valid")){
            result.forEach(System.out::println);
        }

    }
}
