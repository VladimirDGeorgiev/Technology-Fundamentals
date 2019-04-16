package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractFile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  String[] input = scanner.nextLine().split("\\\\");
  int temp = input[input.length-1].lastIndexOf(".");
  String fileName = input[input.length-1].substring(0,temp);
  String fileExtension = input[input.length-1].substring(temp+1);
  System.out.println(String.format("File name: %s",fileName));
  System.out.println(String.format("File extension: %s",fileExtension));
    }
}
