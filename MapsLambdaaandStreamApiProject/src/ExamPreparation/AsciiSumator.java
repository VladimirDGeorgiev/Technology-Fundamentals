package ExamPreparation;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextLine().charAt(0);
        int second = scanner.nextLine().charAt(0);
        int min = Math.min(first,second);
        int max = Math.max(first,second);
        String word = scanner.nextLine();

        int result = 0;
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)>min&&word.charAt(i)<max){
                result+=word.charAt(i);
            }
        }
        System.out.println(result);
    }
}
