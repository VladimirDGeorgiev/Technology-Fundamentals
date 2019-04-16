import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number =Math.abs( Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(number));


    }
    static int getMultipleOfEvensAndOdds(int num){
            int sumEven = sumEven(num);
            int sumOdd = sumOdd(num);

            return sumEven*sumOdd;

    }
    static int sumEven(int num){//234
        int sum = 0;
        while (num!=0) {
            int number = 0;
            number = num % 10; //4
            if (number % 2 == 0) {       //true
                sum += number;       //4
            }
            num -= number; //230
            num /= 10;
        }//23
        return sum;
    }
    static int sumOdd(int num){//234
        int sum = 0;
        while (num!=0) {
            int number = 0;
            number = num % 10; //4
            if (number % 2 != 0) {       //true
                sum += number;       //4
            }
            num -= number; //230
            num /= 10;
        }//23
        return sum;
    }
}
