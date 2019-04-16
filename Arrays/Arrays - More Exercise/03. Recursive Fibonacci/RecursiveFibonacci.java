import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n >= 1 && n <= 50) {


            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                if (i <= 1) {
                    arr[i] = 1;
                } else {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
            }
            System.out.println(arr[n - 1]);
        }
    }
}
