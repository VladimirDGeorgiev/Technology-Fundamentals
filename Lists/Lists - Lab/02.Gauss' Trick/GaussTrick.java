package ListExer;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 2 3 4 5//6 6 3
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        int firstSizeOfList = numbers.size() / 2;

        for (int i = 0; i < firstSizeOfList; i++) {
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.get(numbers.size() - 1));

        }

//     System.out.println(numbers.toString().replaceAll("//[|,//]",""));
        System.out.println(joinElementsByDelimiter(numbers," "));

    }
    public static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }
}
