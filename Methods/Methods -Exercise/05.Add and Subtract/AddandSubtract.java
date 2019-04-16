import java.util.Scanner;

public class AddandSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int sum = sum(a,b);
        int finalSum = subtract(sum,c);
        System.out.println(finalSum);


    }
    static int sum (int a,int b){
        int sum =a+b;
        return sum;
    }
    static int subtract(int a,int b){
        int subtract = a-b;
        return subtract;
    }
}
