import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        String reversed = new StringBuffer(command).reverse().toString();

        System.out.println(reversed);

    }
}
