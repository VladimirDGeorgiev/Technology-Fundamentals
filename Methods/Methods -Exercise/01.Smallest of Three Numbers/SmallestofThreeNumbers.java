import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        printSmallIntFrom3(x1,x2,x3);

    }
    static void  printSmallIntFrom3(int a,int b,int c ){
        if (a<=b&a<=c){
            System.out.println(a);
        }
        else if(b<=a&b<=c){
            System.out.println(b);

        }
        else if(c<=a&c<=b){
            System.out.println(c);

        }


    }
}
