package SetsAndMaps.Exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> chemicalCompounds = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            chemicalCompounds.addAll(Arrays.asList(data));
        }
        for (String chemicalCompound : chemicalCompounds) {
            System.out.print(chemicalCompound+" ");
        }
    }
}
