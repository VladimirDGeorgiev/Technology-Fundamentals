package MidExam;

import java.util.Scanner;

public class TheHuntingGames2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        double waterSum =water*players*days;
        double foodSum = food*players*days;
        for (int i = 1; i <=days ; i++) {
            double energyLost = Double.parseDouble(scanner.nextLine());
            energy-=energyLost;
            if (energy<=0){
                System.out.println(String.format("You will run out of energy." +
                        " You will be left with %.2f food and %.2f water.",foodSum,waterSum));
                return;
            }
            if (i%2==0){
                energy=energy*1.05;
                waterSum=waterSum*0.7;
            }
            if (i%3==0){
                foodSum-=foodSum/players;
                energy=energy*1.1;
            }
        }
        System.out.println(String.format("You are ready for the quest." +
                " You will be left with - %.2f energy!",energy));
    }
}
