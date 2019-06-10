package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilterStudentsByEmailDomain_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        while (!input.equals("END")){
            String[] dataDomain = input.split("@");
            if (dataDomain[1].equals("gmail.com")) {
                String[] dataName = dataDomain[0].split("\\s+");
                System.out.println(dataName[0]+" "+dataName[1]);
            }
            input = reader.readLine();
        }
    }
}
