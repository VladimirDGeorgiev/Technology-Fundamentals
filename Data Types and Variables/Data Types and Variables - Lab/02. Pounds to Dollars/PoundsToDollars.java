import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double paund =Double.parseDouble(scanner.nextLine());

        double dolars =paund*1.31;
        System.out.printf("%.3f",dolars);

    }
}
