import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char command = scanner.nextLine().charAt(0);

        if (command<96){
            System.out.println("upper-case");
        }
        else{
            System.out.println("lower-case");

        }

    }
}
