import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
        if (number<1||number>7){
            System.out.println("Invalid day!");
        }
        else {

            System.out.println(days[number - 1]);
        }

    }
}
