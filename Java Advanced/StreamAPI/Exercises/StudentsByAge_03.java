package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class StudentsByAge_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        LinkedHashMap<String, Integer> names = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            names.putIfAbsent(data[0] + " " + data[1], Integer.valueOf(data[2]));
            input = reader.readLine().trim();
        }
        names.entrySet().stream().filter(e -> e.getValue() >= 18 && e.getValue() <= 24)
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


    }
}
