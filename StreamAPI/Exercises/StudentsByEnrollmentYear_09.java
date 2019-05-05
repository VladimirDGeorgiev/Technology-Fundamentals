package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentsByEnrollmentYear_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();

        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            if (data[0].substring(4).equals("14")||data[0].substring(4).equals("15")){
                for (int i = 1; i < data.length; i++) {
                    System.out.print(data[i]+" ");
                }
                System.out.println();
            }

            input = reader.readLine().trim();
        }
    }
}
