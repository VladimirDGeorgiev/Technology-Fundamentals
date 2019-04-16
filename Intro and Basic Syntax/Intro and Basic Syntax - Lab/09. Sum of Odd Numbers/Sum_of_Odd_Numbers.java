import java.util.Scanner;

public class Sum_of_Odd_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum=0;

        for (int i = 1; i <=100 ; i++) {

            if (i%2==0){
                continue;
            }
            System.out.println(i);
            counter++;
            sum+=i;

            if (counter==n){
                break;
            }

        }
        System.out.printf("Sum: %d",sum);

    }
}
