package HashMapsandStream.Exercise.lab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase().split("\\s+");
        LinkedHashMap<String,Integer> counts = new LinkedHashMap<>();
        for (String i:input) {
            if (counts.containsKey(i)){
                counts.put(i,counts.get(i)+1);
            }else{
                counts.put(i,1);
            }
        }
        List<String> result = new ArrayList<>();

        for (var entry:counts.entrySet()) {
            if (entry.getValue()%2==1){
                result.add(entry.getKey());

            }
        }
        System.out.println(result.toString().replaceAll("[\\[\\]]",""));
    }
}
