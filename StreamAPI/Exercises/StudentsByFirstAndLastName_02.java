package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StudentsByFirstAndLastName_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();

        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            int isItTrue = data[1].compareTo(data[0]);
            if (isItTrue>0){
                System.out.println(input);
            }
            input = reader.readLine().trim();
        }

    }
}
