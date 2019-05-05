package StringProcessing.Exercises;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class Palindromes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[ !?,\\.]+");
        TreeSet<String> palindroms = new TreeSet<>();

        for (int i = 0; i < input.length; i++) {
            boolean flag = true;
            for (int j = 0; j < input[i].length()/2; j++) {
                if (input[i].charAt(j)!=input[i].charAt(input[i].length()-1-j)){
                    flag = false;
                    break;
                }
            }
            if (flag){
                palindroms.add(input[i]);
            }

        }

        System.out.println(palindroms.toString());
    }
}
