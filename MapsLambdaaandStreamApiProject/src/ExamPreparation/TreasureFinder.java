package ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] key = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        String regex = "&(.+)&.*<(.+)>";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equalsIgnoreCase("find")){
            StringBuilder result = new StringBuilder();
            int count = 0;
            for (int i = 0; i <input.length() ; i++) {
               result.append((char) (input.charAt(i) - key[count]));
               count++;
               if (count==key.length){
                   count=0;
               }
            }
            Matcher matcher = pattern.matcher(result.toString());
            if (matcher.find()){

                System.out.println(String.format("Found %s at %s",matcher.group(1),matcher.group(2)));
            }
            input=scanner.nextLine();
        }
    }
}
