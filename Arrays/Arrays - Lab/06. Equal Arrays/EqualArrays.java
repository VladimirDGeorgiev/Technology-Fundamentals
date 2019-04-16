import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = -1;
        int sum = 0;

        for (int i = 0; i <firstArr.length ; i++) {
            if (firstArr[i]!=secondArr[i]){
                index = i;
                break;
            }
            sum+=firstArr[i];

        }

        if (index==-1){
            System.out.println(String.format("Arrays are identical. Sum: %d",sum));
        }
        else{
            System.out.printf(String.format("Arrays are not identical. Found difference at %d index.",index));
        }


    }
}
