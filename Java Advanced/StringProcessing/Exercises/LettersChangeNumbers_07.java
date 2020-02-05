package StringProcessing.Exercises;

import java.util.Scanner;

public class LettersChangeNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double resultSum = 0;
        for (int i = 0; i <input.length ; i++) {
            char firstChar = input[i].charAt(0);
            char lastChar = input[i].charAt(input[i].length()-1);
            double number = Double.parseDouble(input[i].substring(1,input[i].length()-1));
            int charNumber =0;
            if (Character.isUpperCase(firstChar)){
                charNumber=firstChar-64;
                number/=charNumber;
            }else if (Character.isLowerCase(firstChar)){
                charNumber=firstChar-96;
                number*=charNumber;
            }
            if (Character.isUpperCase(lastChar)){
                charNumber=lastChar-64;
                number-=charNumber;
            }else if (Character.isLowerCase(lastChar)){
                charNumber=lastChar-96;
                number+=charNumber;
            }
            resultSum+=number;
        }
        System.out.println(String.format("%.2f",resultSum));
    }
}
