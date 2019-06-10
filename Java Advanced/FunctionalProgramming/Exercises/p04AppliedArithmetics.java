package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p04AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Long> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toList());
        Function<List<Long>,List<Long>> addNum = n->n.stream().map(e->e=e+1).collect(Collectors.toList());
        Function<List<Long>,List<Long>> subtractNum =  n->n.stream().map(e->e=e-1).collect(Collectors.toList());
        Function<List<Long>,List<Long>> multiplyNum = n->n.stream().map(e->e=e*2).collect(Collectors.toList());
        Function<List<Long>,String> printNum = n->String.join(" ",n.toString().replaceAll("[,\\]\\[]",""));
        String commands = "";

        while (!(commands=reader.readLine()).equals("end")){

            switch (commands){
                case "add":numbers = addNum.apply(numbers);
                    break;
                case "subtract":numbers = subtractNum.apply(numbers);
                    break;
                case "multiply":numbers = multiplyNum.apply(numbers);
                    break;
                case "print":
                    System.out.println(printNum.apply(numbers));
                    break;
                default:
                    break;
            }
        }
    }
}
