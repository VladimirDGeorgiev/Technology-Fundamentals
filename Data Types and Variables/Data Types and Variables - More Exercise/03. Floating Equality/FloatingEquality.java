import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        if (numberA>numberB){
            sum = numberA-numberB;
            if (sum>0.000001){
                System.out.println("False");
            }
            else{
                System.out.println("True");
            }

        }
        else
        {
            sum = numberB-numberA;
            if (sum>0.000001){
                System.out.println("False");
            }
            else{
                System.out.println("True");
            }
        }


    }
}
