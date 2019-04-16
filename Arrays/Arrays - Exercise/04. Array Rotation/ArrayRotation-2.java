import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        int[] secondArr = new int[arr.length];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (j==arr.length-1){
                    secondArr[j]=arr[0];
                }
                else {
                    secondArr[j] = arr[j + 1];
                }
            }
            arr = new int[arr.length];
            arr = secondArr;
        }
        for (int i:secondArr) {
            System.out.print(i+" ");
        }

    }
}
