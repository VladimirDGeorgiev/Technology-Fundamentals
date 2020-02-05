package FunctionalProgramming.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        numList.removeIf(n->n%2!=0);
        System.out.println(numList.toString().replaceAll("[\\[\\]]",""));
        numList.sort(Integer::compare);
        System.out.println(numList.toString().replaceAll("[\\[\\]]",""));
    }
}
