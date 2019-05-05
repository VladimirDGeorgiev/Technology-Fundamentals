package StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class MinEvenNumber_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Optional<Double> min = Arrays.stream(reader.readLine().split("\\s+")).filter(n->!n.isEmpty())
                .map(Double::valueOf)
                .filter(n->n%2==0)
                .min(Double::compareTo);
        if (min.isPresent()){
            System.out.println(String.format("%1.2f",min.get())  );
        }else{
            System.out.println("No match");
        }
    }
}
