package ListExer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //8 2 2 4 8 16  8 4 4 8 16  8 8 8 16  16 8 16
        List<Double> listOfNum = Arrays.stream(scanner.nextLine().split(" ")).
                map(Double::parseDouble).
                collect(Collectors.toList());

        for (int i = 0; i < listOfNum.size()-1; i++) {
            if (listOfNum.get(i).equals(listOfNum.get(i + 1))) {
                listOfNum.set(i, listOfNum.get(i) * 2);
                listOfNum.remove(i + 1);
                i = -1;
            }

        }
        System.out.println(joinElementsByDelimiter(listOfNum," "));


    }
    public static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }
}
