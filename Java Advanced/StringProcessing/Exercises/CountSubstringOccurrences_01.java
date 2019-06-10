package StringProcessing.Exercises;

import java.util.Scanner;

public class CountSubstringOccurrences_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String keyWord = scanner.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i <=input.length()-keyWord.length() ; i++) {
            String temp = input.substring(i,i+keyWord.length());
            if (temp.contains(keyWord)){
                count++;
            }
        }
        System.out.println(count);
    }
}
