package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeakStudents_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();

        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            int counter = 0;
            for (int i = 2; i < data.length; i++) {
                if (Integer.valueOf(data[i])<=3){
                    counter++;
                }
            }
            if (counter>=2){
                System.out.println(data[0]+" "+data[1]);
            }
            input = reader.readLine().trim();
        }
    }
}
