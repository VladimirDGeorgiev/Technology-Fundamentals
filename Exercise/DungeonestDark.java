package metodsMoreExersays;

import java.util.Arrays;
import java.util.Scanner;

public class DungeonestDark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int coins = 0;
        String[] input = scanner.nextLine().split("[|+]");
        for (int i = 0; i <input.length ; i++) {
            String[] element = input[i].split("\\s+");
            String command = element[0];
            int num = Integer.parseInt(element[1]);
            switch (command){
                case "potion":

                    health = getPotion(health, num);
                    break;
                case "chest":
                    coins+=num;
                    System.out.println(String.format("You found %d coins.",num));
                    break;
                default:
                    health-=num;
                    if (health>0){//not dead
                        System.out.println(String.format("You slayed %s.",command));
                    }else{//dead
                        System.out.println(String.format("You died! Killed by %s.",command));
                        System.out.println(String.format("Best room: %d",i+1));
                        return;
                    }
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.println(String.format("Coins: %d",coins));
        System.out.println(String.format("Health: %d",health));
    }

    public static int getPotion(int health, int num) {
        if (health+num<=100){
            System.out.println(String.format("You healed for %d hp.",num));
            health+=num;
        }else{
            System.out.println(String.format("You healed for %d hp.",100-health));
            health=100;
        }
        System.out.println(String.format("Current health: %d hp.",health));
        return health;
    }
}
