package FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        List<Double> data = new ArrayList<>();
        UnaryOperator<Double> addVAT = x-> x*1.2;
        for (String s : input) {
            data.add(addVAT.apply(Double.parseDouble(s)));
        }
        System.out.println("Prices with VAT:");
        for (Double num : data) {
            System.out.println(String.format("%1$.2f",num));
        }
    }
}
