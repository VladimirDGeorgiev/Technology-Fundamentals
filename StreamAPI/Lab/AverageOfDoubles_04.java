package StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class AverageOfDoubles_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = reader.readLine().split("\\s+");
        OptionalDouble averige = Arrays.stream(elements).filter(n->!n.isEmpty())
                .mapToDouble(Double::valueOf)
                .average();
        if (averige.isPresent()){
            System.out.println(String.format("%1.2f",averige.getAsDouble()));
        }else{
            System.out.println("No match");
        }
    }
}
