package SetsAndMaps.Exercises;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
        uniqueNames.add(scanner.nextLine());
        }
        for (String uniqueName : uniqueNames) {
            System.out.println(uniqueName);
        }
    }
}
