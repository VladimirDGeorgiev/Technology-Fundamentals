import java.util.Arrays;
import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            printTopInteger(i);
        }
    }

    private static void printTopInteger(int num) {

        int[] arr = Arrays.stream(Integer.toString(num).split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        boolean oddTrue = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddTrue = true;
            }
            sum += arr[i];

        }
        if (oddTrue && sum % 8 == 0) {
            System.out.println(num);
        }
    }
}


