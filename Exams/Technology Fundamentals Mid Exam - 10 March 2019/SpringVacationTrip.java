package MidExam;

import java.util.Scanner;

public class SpringVacationTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double fuelPrice = Double.parseDouble(scanner.nextLine());
        double foodPrice = Double.parseDouble(scanner.nextLine())*days*people;
        double roomPrice = Double.parseDouble(scanner.nextLine())*days*people;
        if (people>10){
            roomPrice=roomPrice*0.75;
        }
        double sum = foodPrice+roomPrice;
        for (int i = 1; i <=days ; i++) {
            double kilometers = Double.parseDouble(scanner.nextLine());
            sum +=kilometers*fuelPrice;
            if (sum>budget){
                System.out.println(String.format("Not enough money to continue the trip." +
                        " You need %.2f$ more.",sum-budget));
                return;
            }
            if (i%3==0||i%5==0){
                sum+=sum*0.4;
            }
            if (sum>budget){
                System.out.println(String.format("Not enough money to continue the trip." +
                        " You need %.2f$ more.",sum-budget));
                return;
            }
            if (i%7==0){
                sum-=sum/people;
            }

        }
        System.out.println(String.format("You have reached the destination." +
                " You have %.2f$ budget left.",budget-sum));



    }
}
