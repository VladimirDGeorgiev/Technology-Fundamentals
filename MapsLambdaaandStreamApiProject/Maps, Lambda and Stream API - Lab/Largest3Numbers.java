package HashMapsandStream.Exercise.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted((x1,x2)->Integer.compare(x2,x1))
                .limit(3)
                .collect(Collectors.toList());
        for (Integer i:sorted
             ) {
            System.out.print(i+" ");
        }
    }
}
