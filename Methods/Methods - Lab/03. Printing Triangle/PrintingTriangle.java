import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);

    }
    static void printTriangle (int num){

        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        for (int i = 1; i <=num-1 ; i++) {
            for (int j = 1; j<=num-i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
