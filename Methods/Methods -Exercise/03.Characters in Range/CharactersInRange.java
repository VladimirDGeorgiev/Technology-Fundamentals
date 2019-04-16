import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printChars(a,b);
    }
    static void printChars(char a,char b){
        if (b<a){
            char temp = a;
            a=b;
            b=temp;
        }
        for (int i = a+1; i <=b-1 ; i++) {
            System.out.print((char)i+" ");

        }
    }
}
