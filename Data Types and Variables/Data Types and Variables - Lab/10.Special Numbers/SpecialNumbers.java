import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=num ; i++) {

          int  secondDigit = i%10;

          int firstDigit = (i-secondDigit)/10;
          int sum = secondDigit+firstDigit;
          if (sum==5||sum==7||sum==11) {
              System.out.printf("%d -> True%n",i);
          }
          else{
              System.out.printf("%d -> False%n",i);

          }


        }
    }
}
