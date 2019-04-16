import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] trainWagon = new int[n];

        for (int i = 0; i <trainWagon.length ; i++) {
            trainWagon[i]=Integer.parseInt(scanner.nextLine());

        }
        int sum = 0;
        for (int i:trainWagon) {
            System.out.print(i+" ");
            sum+=i;

        }
        System.out.println(String.format("%n%d",sum));



    }
}
