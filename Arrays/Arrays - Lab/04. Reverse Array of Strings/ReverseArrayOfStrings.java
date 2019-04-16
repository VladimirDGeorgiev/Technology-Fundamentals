import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i <words.length ; i++) {
            System.out.print(words[ words.length-i-1]+" ");

        }

    }
}
