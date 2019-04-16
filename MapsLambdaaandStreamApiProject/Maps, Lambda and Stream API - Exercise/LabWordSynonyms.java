package MapsLambdaandStreamAPI;

import java.awt.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LabWordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedHashMap<String, ArrayList<String>> data = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String word = scanner.nextLine();
            String sinonim = scanner.nextLine();

            data.putIfAbsent(word,new ArrayList<>());
            data.get(word).add(sinonim);
        }
        for (Map.Entry<String,ArrayList<String>> j: data.entrySet()
             ) {
            System.out.println(String.format("%s - %s",j.getValue(),j.getValue()));
        }
    }
}
