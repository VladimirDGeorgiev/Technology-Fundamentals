import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double b = Integer.parseInt(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("0.########");
        System.out.println(format.format(calculator(a,operator,b)));

    }
    static double calculator(double x1, char operator , double x2){
        double result = 0;

        switch (operator){
            case '+':result= x1+x2;break;
            case '-':result= x1-x2;break;
            case '*':result= x1*x2;break;
            case '/':result= x1/x2;break;
            case '%':result= x1%x2;break;
            case '^':result=1;
                for (int i = 1; i <= x2; i++) {
                 result *= x1;
                 }
            break;

            default:break;
        }
        return result;
    }
}
