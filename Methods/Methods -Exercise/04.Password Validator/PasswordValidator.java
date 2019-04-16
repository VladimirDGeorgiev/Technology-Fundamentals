import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] password = scanner.nextLine().toLowerCase().split("");

        boolean a= validatorLong(password);
        boolean b=validatorOfLettersAndDigits(password);
        boolean c=validatorTwoDigits(password);

        if (a&&b&&c){
            System.out.println("Password is valid");
        }
    }




    static boolean validatorLong(String[] arr){
        boolean a =true;
        if (arr.length<6||arr.length>10){
            a = false;
            System.out.println("Password must be between 6 and 10 characters");
        }
        return a;
    }
    static boolean validatorOfLettersAndDigits(String[] arr){
        boolean b = true;
        char[] newArr = new char[arr.length];
        for (int j = 0; j <newArr.length; j++) {
            newArr[j]=arr[j].charAt(0);
        }
        for (int i = 0; i <newArr.length ; i++) {
            if ((newArr[i]<48||newArr[i]>57)&&
                    (newArr[i]<97||newArr[i]>122)){
                b=false;

            }

        }
        if (!b) {
            System.out.println("Password must consist only of letters and digits");
        }
        return b;
    }
    static boolean validatorTwoDigits (String[] arr){
        boolean c = true;
        char[] newArr = new char[arr.length];
        for (int j = 0; j <newArr.length; j++) {
            newArr[j]=arr[j].charAt(0);
        }
        int counter = 0;
        for (int i = 0; i <newArr.length ; i++) {

            if (newArr[i]>=48&&newArr[i]<=57){
                counter++;
            }
        }
        if (counter<2){
            c=false;
            System.out.println("Password must have at least 2 digits");
        }

        return c;
    }
}
