import java.util.Scanner;

public class Sort_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a>b&&a>c){
            System.out.println(a);
            if (b>c){
                System.out.println(b);
                System.out.println(c);
            }
            if (b<c){
                System.out.println(c);
                System.out.println(b);
            }
            if (b==c){
                System.out.println(b);
                System.out.println(c);
            }

        }
        if (b>a&&b>c){
            System.out.println(b);
            if (a>c){
                System.out.println(a);
                System.out.println(c);
            }
            if (a<c){
                System.out.println(c);
                System.out.println(a);
            }
            if (a==c){
                System.out.println(a);
                System.out.println(c);
            }
        }
        if (c>a&&c>b){
            System.out.println(c);
            if (a>b){
                System.out.println(a);
                System.out.println(b);
            }
            if (a<b){
                System.out.println(b);
                System.out.println(a);
            }
            if (b==a){
                System.out.println(a);
                System.out.println(b);
            }
        }
    }
}
