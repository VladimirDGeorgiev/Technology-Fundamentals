package TextProcessingandRegularExpressions.moreExers;

import java.util.Scanner;

public class AsciiSumator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        String word = scanner.nextLine();
        int sum = 0;
        if (end<start){
            char temp = end;
            end = start;
            start = temp;
        }
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)>start&&word.charAt(i)<end){
                sum+=word.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
