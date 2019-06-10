package StringProcessing.Exercises;

import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = scanner.nextLine();
        String secondNum = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int index = 0;
        int count =1;
        int residue = 0;

        while (true){
            if (firstNum.length()==0){
                if (secondNum.length()!=0){
                    long sum = Integer.parseInt(secondNum)+residue;
                    result.insert(0,sum);
                    break;
                }
                break;
            }
            if (secondNum.length()==0){
                if (firstNum.length()!=0) {
                long sum = Integer.parseInt(firstNum)+residue;
                result.insert(0,sum);
                break;
                }

            break;
            }
            int first = Integer.parseInt(String.valueOf(firstNum.charAt(firstNum.length()-1)));
            int second = Integer.parseInt(String.valueOf(secondNum.charAt(secondNum.length()-1)));
            firstNum = firstNum.substring(0,firstNum.length()-count);
            secondNum = secondNum.substring(0,secondNum.length()-count);
            String sum = String.valueOf(first+second+residue);
            if (sum.length()==2){
                result.insert(0,sum.charAt(1));
                residue = Integer.parseInt(String.valueOf(sum.charAt(0)));
            }else {
                result.insert(0,sum.charAt(0));
                residue=0;
            }

        }
        System.out.println(result);
    }
}

