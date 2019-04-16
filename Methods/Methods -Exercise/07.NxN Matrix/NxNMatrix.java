import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        matrixNxN(n);
    }
    static void matrixNxN(int number){
        for (int i = 1; i <=number ; i++) {
            for (int j = 1; j <=number ; j++) {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
}
