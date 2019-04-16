package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;

public class CharacterMultiplier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String firstString = input[0];
        String secondString = input[1];
       int sum = multiplierChars(firstString,secondString );
        System.out.println(sum);
    }

    private static int multiplierChars(String firstString, String secondString) {
        int sum = 0;
        int lenght = Math.min(firstString.length(),secondString.length());
        for (int i = 0; i <lenght ; i++) {
            sum+=firstString.charAt(i)*secondString.charAt(i);
        }
        if (firstString.length()!=secondString.length()){
            String biggerStrin = "";
            if (firstString.length()>secondString.length()){
                biggerStrin=firstString;
            }else{
                biggerStrin=secondString;
            }
            int max = Math.max(firstString.length(),secondString.length());
            for (int j = lenght; j <max ; j++) {
                sum+=biggerStrin.charAt(j);
            }
        }

        return  sum;
    }
}
