import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("");
        printMiddleCharacters(arr);
    }
    static void printMiddleCharacters(String[] arr){
        if (arr.length%2!=0){
            System.out.println(arr[(arr.length-1)/2]);
        }
        else{
            System.out.println(arr[(arr.length/2)-1]+arr[(arr.length/2)]);
        }
    }
}
