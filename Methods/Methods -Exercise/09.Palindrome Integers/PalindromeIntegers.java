import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")){
            int[] number = Arrays.stream(command.split("")).
                    mapToInt(Integer::parseInt).toArray();
            System.out.println(palidrome(number));
            command = scanner.nextLine();
        }




    }
    static boolean palidrome(int[] num){
        boolean result=true;
        for (int i = 0; i <num.length ; i++) { //01234
            if (num[i]!=num[num.length-i-1]) {
                result=false;
            }

        }
        return result;

    }
}
