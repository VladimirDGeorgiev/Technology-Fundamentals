import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLine = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <=numberOfLine ; i++) {
            char letters = scanner.nextLine().charAt(0);
            sum+=letters;

        }
        System.out.println(String.format("The sum equals: %d",sum));

    }
}
