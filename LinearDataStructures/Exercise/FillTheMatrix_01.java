package LinearDataStructures.Exercise;

import java.util.Scanner;

public class FillTheMatrix_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int number = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] resultMatrix = new int[number][number];

        if (pattern.equals("A")) {
            fillPatternA(resultMatrix);
        }else if (pattern.equals("B")){
            fillPatternB(resultMatrix);
        }
        for (int[] matrix : resultMatrix) {
            for (int i : matrix) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void fillPatternB(int[][] resultMatrix) {
        int count = 1;
        boolean changeCol = true;
        for (int col = 0; col < resultMatrix.length; col++) {
            if (changeCol) {
                for (int row = 0; row < resultMatrix.length; row++) {
                    resultMatrix[row][col] = count++;
                }
                changeCol=false;
            }else  {
                for (int row = resultMatrix.length-1; row >=0 ; row--) {
                    resultMatrix[row][col] = count++;

                }
                changeCol = true;
            }
        }
    }

    private static void fillPatternA(int[][] resultMatrix) {
        int count = 1;
        for (int col = 0; col < resultMatrix.length; col++) {
            for (int row = 0; row < resultMatrix.length; row++) {
                resultMatrix[row][col]=count++;

            }
        }
    }
}
