import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (1 <= n && n <= 60) {
            int[] arr1 = new int[n];

            int[] arr2 = new int[n];

                for (int j = 1; j <=n ; j++) {
                    System.out.println();
                    for (int k = 0; k <j ; k++) {
                        System.out.print(j+k);
                    }
                }

            }





        }

    }

