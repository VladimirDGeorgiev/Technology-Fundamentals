package SetsAndMaps.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class VoinaNumbergame03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<Integer> firstPlayer = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayer = new LinkedHashSet<>();
        fillTheSet(scanner, firstPlayer);
        fillTheSet(scanner, secondPlayer);
        for (int i = 0; i <50 ; i++) {
            int firstNumber  = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber  = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);
            if (firstNumber>secondNumber){
                firstPlayer.add(firstNumber);
                firstPlayer.add(secondNumber);
            }else {
                secondPlayer.add(secondNumber);
                secondPlayer.add(firstNumber);
            }
            if (firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                return;
            }
            if (secondPlayer.isEmpty()){
                System.out.println("First player win!");
                return;
            }

        }
        if (firstPlayer.size()>secondPlayer.size()){
            System.out.println("First player win!");
        }else if (firstPlayer.size()<secondPlayer.size()){
            System.out.println("Second player win!");
        }else{
            System.out.println("Draw!");
        }
    }

    private static void fillTheSet(Scanner scanner, LinkedHashSet<Integer> firstPlayer) {
        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i : first) {
            firstPlayer.add(i);
        }
    }
}
