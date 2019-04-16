import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());

        int add = x1+x2;
        int divide = add/x3;
        int sum = divide*x4;
        System.out.println(sum);

    }
}
