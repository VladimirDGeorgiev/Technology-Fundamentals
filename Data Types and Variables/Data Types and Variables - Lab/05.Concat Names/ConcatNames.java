import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(firstString+delimiter+secondString);


    }
}
