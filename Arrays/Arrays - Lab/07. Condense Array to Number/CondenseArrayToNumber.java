import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if ( nums.length == 1) {
            System.out.println(nums[0]);
            return;
        }
        int[] condensed =new int[nums.length-1];
        while (true) {

            for (int i = 0; i < nums.length - 1; i++) {
                condensed[i] = nums[i] + nums[i + 1];
            }
            nums = new int[condensed.length];
            for (int j = 0; j < condensed.length; j++) {
                nums[j] = condensed[j];

            }
          if ( nums.length == 1) {
              System.out.println(nums[0]);
              break;
          }
            condensed = new int[nums.length - 1];
        }



    }
}
