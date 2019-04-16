import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    sum = 12;
                }
                else if (age > 18 && age <= 64) {
                    sum = 18;
                }
                else if (age > 64 && age <= 122) {
                    sum = 12;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    sum = 15;
                }
                else  if (age > 18 && age <= 64) {
                    sum = 20;
                }
                else  if (age > 64 && age <= 122) {
                    sum = 15;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    sum = 5;
                }
                else if (age > 18 && age <= 64) {
                    sum = 12;
                }
                else  if (age > 64 && age <= 122) {
                    sum = 10;
                } else {
                    System.out.println("Error!");
                    return;
                }
                break;

            default:
                break;

        }
        System.out.printf("%d$",sum);
    }
}
