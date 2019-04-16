import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr =new int[n];

        for (int i = 0; i <n ; i++) {
            int firstNum =Integer.parseInt( scanner.next());
            int secondNum =Integer.parseInt( scanner.next());
            if (i%2==0){

                firstArr[i]=firstNum;
                secondArr[i]=secondNum;
            }
            else{
                firstArr[i]=secondNum;
                secondArr[i]=firstNum;
            }

        }
        for (int i :firstArr) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i :secondArr) {

            System.out.print(i+" ");
        }

    }
}
