package StringProcessing.Lab;

import java.util.Scanner;

public class ParseTags_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (input.contains("<upcase>")){
            int startIndex = input.indexOf("<upcase>");
            int endIndex = input.indexOf("</upcase>");
            String temp = input.substring(startIndex+8,endIndex);
            String tempUpper = input.substring(startIndex+8,endIndex).toUpperCase();
            input= input.replaceFirst(temp,tempUpper);
            input = input.replaceFirst("<upcase>","");
            input = input.replaceFirst("</upcase>","");
        }
        System.out.println(input);
    }
}
