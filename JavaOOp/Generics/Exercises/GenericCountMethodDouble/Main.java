package JavaOOp.Generics.Exercises.GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Double> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(Double.parseDouble(reader.readLine()));
        }
        Double element =Double.parseDouble(reader.readLine());
        int result = Box.compare(data,element);
        System.out.println(result);


    }

}

