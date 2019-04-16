import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int i :numbers) {
            if (i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }

        }
        System.out.println(evenSum-oddSum);
    }
}
