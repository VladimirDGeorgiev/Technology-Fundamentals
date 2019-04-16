import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int meters =Integer.parseInt(scanner.nextLine());

        double kilometers = meters/1000d;
        System.out.printf("%.2f",kilometers);


    }
}
