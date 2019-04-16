import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String stringSum = stringRepeat(command,n);
        System.out.println(stringSum);
    }
    static String stringRepeat(String a,int b){
        String sum = "";
        for (int i = 0; i <b ; i++) {
            sum+=a;
        }
        return sum;
    }
}
