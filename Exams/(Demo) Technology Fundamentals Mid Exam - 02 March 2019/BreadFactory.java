package demoMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BreadFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = 100;
        int coins = 100;
        List<String> data = Arrays.stream(scanner.nextLine().split("\\|+")).collect(Collectors.toList());

        for (int i = 0; i <data.size() ; i++) {
            String[] command = data.get(i).split("\\-+");
            String event = command[0].toLowerCase();
            int number = Integer.parseInt(command[1]);
            if (event.equals("rest")){
                if (number+energy>=100){
                    System.out.println(String.format("You gained %d energy.",100-energy));
                    energy=100;
                }else {

                    System.out.println(String.format("You gained %d energy.",number));
                    energy+=number;
                }
                System.out.println(String.format("Current energy: %d.",energy));
            }else if (event.equals("order")){                               //vyzmojen problem
                energy-=30;
                if (energy>=0){
                    coins+=number;
                    System.out.println(String.format("You earned %d coins.",number));
                }else{
                    energy+=50+30;
                    System.out.println("You had to rest!");
                }
            }else{
                coins-=number;
                if (coins>0){
                    System.out.println(String.format("You bought %s.",event));
                }else {
                    System.out.println(String.format("Closed! Cannot afford %s.",event));
                    return;
                }

            }
        }
        System.out.println("Day completed!");
        System.out.println(String.format("Coins: %d",coins));
        System.out.println(String.format("Energy: %d",energy));
    }
}
