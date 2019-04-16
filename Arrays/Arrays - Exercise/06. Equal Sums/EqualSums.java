import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrNumbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum =0;
        boolean equals = false;
        for (int i = 0; i <arrNumbers.length ; i++) {
            rightSum=0;
            leftSum=0;
            for (int j = i+1; j <arrNumbers.length ; j++) {
                rightSum+=arrNumbers[j];
            }

            for (int k = 0; k <i ; k++) {
                leftSum+=arrNumbers[k];

            }
            if (leftSum==rightSum){
                System.out.println(i);
                equals=true;
            }
        }
        if (!equals){
            System.out.println("no");

        }
    }
}
