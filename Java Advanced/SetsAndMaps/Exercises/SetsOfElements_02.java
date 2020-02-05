package SetsAndMaps.Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        LinkedHashSet<Integer> setM = new LinkedHashSet<>();
        LinkedHashSet<Integer> setN = new LinkedHashSet<>();
        for (int i = 0; i <m ; i++) {
            setM.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int j = 0; j <n ; j++) {
            setN.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer elementM : setM) {
            for (Integer elementN : setN) {
                if (elementM.equals(elementN)){
                    System.out.print(elementM+" ");
                }
            }
        }
    }
}
