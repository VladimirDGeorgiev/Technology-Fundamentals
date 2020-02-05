package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FilterStudentsByPhone_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Map<String, String> phoneNumbers = new LinkedHashMap<>();
        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            phoneNumbers.putIfAbsent(data[0]+" "+data[1],data[2]);
            input = reader.readLine();
        }
        phoneNumbers.entrySet().stream()
                .filter(e->e.getValue().substring(0,2).equals("02")
                        ||e.getValue().substring(0,5).equals("+3592"))
                .forEach(e-> System.out.println(e.getKey()));
    }
}
