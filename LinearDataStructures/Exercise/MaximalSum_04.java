package LinearDataStructures.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int column = Integer.parseInt(input[1]);

        int[][] inputMatrix = new int[row][column];
        for (int r = 0; r <row ; r++) {
            int[] inputData = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int c = 0; c <column ; c++) {
                inputMatrix[r][c]=inputData[c];
            }

        }
        int sumMax = Integer.MIN_VALUE;
        int indexOfRow = 0;
        int indexOfColumn = 0;

        for (int r = 0; r < row - 2; r++) {
            for (int c = 0; c <column-2 ; c++) {
                int curentSum = inputMatrix[r][c]+inputMatrix[r][c+1]+inputMatrix[r][c+2]+
                          inputMatrix[r+1][c]+inputMatrix[r+1][c+1]+inputMatrix[r+1][c+2]+
                          inputMatrix[r+2][c]+inputMatrix[r+2][c+1]+inputMatrix[r+2][c+2];
                if(sumMax<curentSum){
                    sumMax=curentSum;
                    indexOfRow=r;
                    indexOfColumn=c;
                }
            }
        }
        System.out.println("Sum = "+sumMax);
        for (int i = indexOfRow; i <=indexOfRow+2 ; i++) {
            for (int j = indexOfColumn; j <=indexOfColumn+2 ; j++) {
                System.out.print(inputMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
