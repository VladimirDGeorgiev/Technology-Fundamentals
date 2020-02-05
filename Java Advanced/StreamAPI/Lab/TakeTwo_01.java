package StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TakeTwo_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        List<Integer> result = new ArrayList<>();
        for (String s : input) {
            result.add(Integer.parseInt(s));
        }
        result.stream()
                .filter(n->n>=10&&n<=20)
                .distinct()
                .limit(2)
                .forEach(e->{
                    System.out.print(e+" ");
                });

    }
}
