import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":add(firstNum,secondNum);break;
            case "subtract":subtract(firstNum,secondNum);break;
            case "multiply":multiply(firstNum,secondNum);break;
            case "divide":divide(firstNum,secondNum);break;
            default:
                return;

        }

    }
    static void add (int first , int second){

        System.out.println(first+second);
    }
    static void subtract (int first , int second){

        System.out.println(first-second);
    }
    static void multiply (int first , int second){

        System.out.println(first*second);
    }
    static void divide (int first , int second){

        System.out.println(first/second);
    }


}
