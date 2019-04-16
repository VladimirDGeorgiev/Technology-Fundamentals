import java.util.Scanner;

public class SignOfIntegerNumbers {
    static void printNumbers(int num){
        if (num>0){
            System.out.printf(String.format("The number %d is positive.",num));
        }
        else  if (num<0){
            System.out.printf(String.format("The number %d is negative.",num));
        }
        else  if (num==0){
            System.out.printf(String.format("The number 0 is zero."));
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNumbers(number);


    }
}
