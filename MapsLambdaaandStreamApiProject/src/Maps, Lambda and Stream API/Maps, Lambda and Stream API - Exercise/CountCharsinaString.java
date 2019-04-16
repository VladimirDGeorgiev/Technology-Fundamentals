package HashMapsandStream.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll(" ","");
        LinkedHashMap<Character,Integer> data = new LinkedHashMap<>();
        for (int i = 0; i <input.length() ; i++) {
            if (!data.containsKey(input.charAt(i))){
                data.put(input.charAt(i),0);
                data.put(input.charAt(i),data.get(input.charAt(i))+1);
            }else{
                data.put(input.charAt(i),data.get(input.charAt(i))+1);
            }
        }
        for (Map.Entry<Character,Integer> j:data.entrySet()) {
            System.out.println(String.format("%s -> %d",j.getKey(),j.getValue()));
        }
    }
}
