package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "<(.)(.)>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder result = new StringBuilder();
        while (matcher.find()){
            char temp1 = matcher.group(1).charAt(0);
            int first =temp1;
            int second =matcher.group(2).charAt(0);
            int bombPower = Math.abs(first-second);
            String bomb = "<"+matcher.group(1)+matcher.group(2)+">";
            int startIndexBomb = input.indexOf(bomb);


            result = new StringBuilder();
            for (int i = 0; i <input.length() ; i++){
            int count = 0;
             if (i<startIndexBomb-bombPower||i>startIndexBomb+bomb.length()-1+bombPower){
                 result.append(input.charAt(i));
             }else{
                 if (String.valueOf(input.charAt(i)).equals("<")){
                     count++;
                     if (count==2){
                         break;
                     }
                 }
                 result.append('_');
             }
            }
            input=result.toString();
            result.replace(0,input.length(),input);
        }
        System.out.println(result);
    }
}
