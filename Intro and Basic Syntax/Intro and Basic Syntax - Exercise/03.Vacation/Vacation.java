import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numStudent = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String dayOfTheWeak = scanner.nextLine();

        double sum = 0;

        switch (type) {
            case "Students":
                switch (dayOfTheWeak) {
                    case "Friday":
                        sum = 8.45;
                        break;
                    case "Saturday":
                        sum = 9.80;
                        break;
                    case "Sunday":
                        sum = 10.46;
                        break;
                    default:
                        break;

                }
                break;
            case "Business":
                switch (dayOfTheWeak) {
                    case "Friday":
                        sum = 10.9;
                        break;
                    case "Saturday":
                        sum = 15.6;
                        break;
                    case "Sunday":
                        sum = 16;
                        break;
                    default:
                        break;

                }
                break;

            case "Regular":
                switch (dayOfTheWeak) {
                    case "Friday":
                        sum = 15;
                        break;
                    case "Saturday":
                        sum = 20;
                        break;
                    case "Sunday":
                        sum = 22.5;
                        break;
                    default:
                        break;

                }
                break;
            default:
                break;
        }
        switch (type) {
            case "Students":
                if (numStudent >= 30) {
                    sum = sum * 0.85;
                }
                break;
            case "Business":
                if (numStudent >= 100) {
                    numStudent -= 10;
                }
                break;
            case "Regular":
                if (numStudent >= 10 && numStudent <= 20) {
                    sum = sum * 0.95;
                }
                break;
            default:
                break;
        }
        sum *= numStudent;

        System.out.println(String.format("Total price: %.2f", sum));

    }
}
