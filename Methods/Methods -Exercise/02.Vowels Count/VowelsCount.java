import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        countVowels(word);

    }
    static void countVowels(String str){
        int counter = 0;
        String[] arr =str.split("");
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].equals("a")||
                    arr[i].equals("o")||
                    arr[i].equals("i")||
                    arr[i].equals("e")||
                    arr[i].equals("u")){
                counter++;
            }

        }

        System.out.println(counter);

    }
}
