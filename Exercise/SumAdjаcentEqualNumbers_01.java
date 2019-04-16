import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjаcentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) * 2);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbers, " "));

    }

    static String joinElementsByDelimiter(List<Double> input, String delimiter) {
        String output = "";
        DecimalFormat format = new DecimalFormat("#.#");
        for (Double aDouble : input) {
            output += format.format(aDouble) + delimiter;
        }
        return output;
    }
}
