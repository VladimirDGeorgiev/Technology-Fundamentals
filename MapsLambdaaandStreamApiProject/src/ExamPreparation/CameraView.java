package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CameraView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputInts =scanner.nextLine().split("\\s+");
        int m = Integer.parseInt(inputInts[0]);
        int n = Integer.parseInt(inputInts[1]);
        String data = scanner.nextLine();
        String regex = "\\|<([^\\|]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        List<String> result = new ArrayList<>();

        while (matcher.find()){
            String word = matcher.group(1);
            if (word.length()>m){
                word=word.substring(m);
                if (word.length()>n){
                    word=word.substring(0,n);
                }
                if (word.length()<=n){
                    result.add(word);
                }
            }

        }
        System.out.println(String.join(", ",result));

    }
}
