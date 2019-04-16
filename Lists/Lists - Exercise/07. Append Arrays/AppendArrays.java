package ListExer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputData = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String inputToString = inputData.toString().replaceAll("[\\[,\\]\\s+]", "");

        List<String> input = Arrays.stream(inputToString.split("\\|+")).collect(Collectors.toList());
        Collections.reverse(input);
        String outPut = input.toString().replaceAll("[\\[,\\]\\s+]", "");
        List<String> result =Arrays.stream(outPut.split("")).collect(Collectors.toList());
        for (String i :result) {
            if (i.equals("-")){
                System.out.print("-");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
