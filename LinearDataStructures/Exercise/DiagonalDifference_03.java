package LinearDataStructures.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int difference = diagonalDifference(scanner, size, primaryDiagonal, secondaryDiagonal);
        System.out.println(difference);


    }

    private static int diagonalDifference(Scanner scanner, int size, int primaryDiagonal, int secondaryDiagonal) {
        for (int i = 0; i <size ; i++) {
            int[] inputData = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            primaryDiagonal+=inputData[i];
            secondaryDiagonal+=inputData[size-1-i];

        }
        return Math.abs(primaryDiagonal-secondaryDiagonal);
    }

}
