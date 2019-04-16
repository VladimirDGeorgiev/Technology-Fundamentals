import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            int num = Integer.parseInt(scanner.nextLine());
            if (num%2!=0){
                System.out.println(String.format("Please write an even number."));
                continue;
            }
            else{
                System.out.println(String.format("The number is: %d",Math.abs(num)));
                return;
            }
        }



    }
}
