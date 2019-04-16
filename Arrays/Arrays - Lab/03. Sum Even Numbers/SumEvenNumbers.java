import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        
        int[] arrayInt= new int[array.length];
        
        for (int i = 0; i <array.length ; i++) {
            arrayInt[i]=Integer.parseInt(array[i]);

        }
        int sum = 0;
        for (int i = 0; i <arrayInt.length ; i++) {

            if (arrayInt[i]%2==0){
                sum+=arrayInt[i];
            }
        }

        System.out.println(sum);


    }
}
