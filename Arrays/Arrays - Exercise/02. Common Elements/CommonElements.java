import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String i:secondArr) {
            for (String j:firstArr) {
                if (i.equals(j)){
                    System.out.print(j+" ");
                }
            }
        }

    }
}
