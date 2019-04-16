package ListExer;

import javax.imageio.metadata.IIOMetadataNode;
import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Massegeng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        //String word = scanner.nextLine();
       List<String> wordList = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        String resultList = "";

        for (String i:numList) {
            int sum=0;
            for (int j = 0; j <i.length() ; j++) {//index
                sum+=Integer.parseInt (String.valueOf(i.charAt(j)));
            }
            sum=sum%wordList.size();
            resultList+=wordList.get(sum);
            wordList.remove(sum);
        }
        System.out.println(resultList);
    }
}
