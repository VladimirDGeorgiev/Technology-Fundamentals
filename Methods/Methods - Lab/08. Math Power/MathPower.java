import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        double sum = pow(number, pow);
        DecimalFormat format = new DecimalFormat("0.########");
        System.out.println(format.format(sum));



    }

    static double pow(double a, int b) {
        double sum = 1;
        for (int i = 1; i <= b; i++) {
            sum *= a;
        }
        return sum;
    }
}
