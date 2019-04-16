import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        int sum = 0;


        for (int i = 0; i < num.length(); i++) {
            int number = Integer.parseInt(String.valueOf(num.charAt(i)));
            int loopsum = 1;

            for (int j = 1; j <= number; j++) {
                loopsum = loopsum * j;
            }
            sum += loopsum;

        }
        int numInt = Integer.parseInt(num);

        if (numInt == sum)
            System.out.println("yes");
        else System.out.println("no");


    }
}
