import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bigger = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > bigger) {
                if (i == 0) {
                    bigger = arr[i];
                    continue;
                }
                bigger = arr[i];
                count = 0;
            } else {
                count++;
                if (count == 1) {

                    System.out.println(bigger);

                }
            }
        }
    }
}