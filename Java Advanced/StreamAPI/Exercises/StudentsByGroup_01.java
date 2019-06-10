package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentsByGroup_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        List<String> names = new ArrayList<>();

        while (!input.equals("END")){
            if (String.valueOf(input.charAt(input.length()-1)).equals("2")){
                names.add(input.substring(0,input.length()-2));
            }
            input = reader.readLine().trim();
        }
        names.stream().sorted().forEach(System.out::println);
    }
}
