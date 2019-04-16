import java.util.Scanner;

public class Rage_Expenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double lostGameCount = Double.parseDouble(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        double countHeadset =Math.floor( lostGameCount/2);
        double countMouse = Math.floor(lostGameCount/3);
        double countKeybord = Math.floor(lostGameCount/6);
        double countDisplay = Math.floor(lostGameCount/12);

        double sum = priceDisplay*countDisplay+priceHeadset*countHeadset+
                priceKeyboard*countKeybord+priceMouse*countMouse;

        System.out.println(String.format("Rage expenses: %.2f lv.",sum));


    }
}
