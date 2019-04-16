import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       String[] input = scanner.nextLine().split(" ");

       int[] command = new int[input.length];

        for (int i = 0; i <command.length ; i++) {
            command[i]=Integer.parseInt( input[i]);
        }

        int end = 0;
        int countEnd = 1;
        for (int i = 0; i <command.length ; i++) {
            int sum = 0;
            int counter = 1;
            for (int j = i; j <command.length-1 ; j++) {

            if (command[j]==command[j+1]){
            sum = command[j];
            counter++;
            }else {
                break;
            }
            }
            if (counter>countEnd){
                end=sum;
                countEnd=counter;

            }
            }

        for (int i = 1; i <=countEnd ; i++) {
            System.out.print(end+ " ");
        }

    }
}
