package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExcellentStudents_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader
                        (new InputStreamReader(System.in));
        String input = reader.readLine().trim();

        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            if (input.contains("6")){
                System.out.println(data[0]+" "+data[1]);
            }
            input = reader.readLine().trim();
        }

    }
}
