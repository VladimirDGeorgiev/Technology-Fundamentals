package SetsAndMaps.Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character,Integer> data = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
        data.putIfAbsent(input.charAt(i),0);
        data.put(input.charAt(i),data.get(input.charAt(i))+1);
        }
        data.forEach((key,value)->{
            System.out.println(String.format("%s: %d time/s",key,value));
        });
    }
}
