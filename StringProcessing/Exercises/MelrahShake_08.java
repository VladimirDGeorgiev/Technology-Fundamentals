package StringProcessing.Exercises;

import java.util.Scanner;

public class MelrahShake_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word =scanner.nextLine();
        String key = scanner.nextLine();
        while (word.toString().contains(key)){

          int startIndex = word.indexOf(key)+key.length();
          int lastIndex = word.lastIndexOf(key);
          word = word.replaceFirst(key,"");

          word= word.substring(startIndex,lastIndex+1);
          int indexOfMIdkey = key.length()/2;
          key = key.substring(0,indexOfMIdkey)+key.substring(indexOfMIdkey);
        }
    }
}
