package ListExer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());
        Collections.reverse(input);
        System.out.println(input.toString().replaceAll("[\\[\\],]","").replaceAll("\\s+", " ").trim());

    }
}
