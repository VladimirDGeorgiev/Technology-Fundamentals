import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        double sum = (double)factorial(a)/factorial(b);
        System.out.println(String.format("%.2f",sum));
    }
    static long factorial(int num){
        long sum =1;
        for (int i = 1; i <=num ; i++) {

            sum*=i;
        }
        return sum;
    }
}
