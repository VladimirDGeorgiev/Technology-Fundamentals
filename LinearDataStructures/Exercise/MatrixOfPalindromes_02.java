package LinearDataStructures.Exercise;

import java.util.Scanner;

public class MatrixOfPalindromes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.next());
        int column = Integer.parseInt(scanner.next());
        if (row+column>=27){
            return;
        }
        String[][] resultMatrix = new String[row][column];
        fillMatrix(row, column, resultMatrix);
        printMatrix(resultMatrix);

    }

    private static void fillMatrix(int row, int column, String[][] resultMatrix) {
        for (int r = 0; r <row ; r++) {
            for (int c = 0; c <column ; c++) {
                resultMatrix[r][c]=String.valueOf(Character.toChars(97+r))
                        +String.valueOf(Character.toChars(97+r+c))
                        +String.valueOf(Character.toChars(97+r));
            }

        }
    }

    private static void printMatrix(String[][] resultMatrix) {
        for (String[] rows : resultMatrix) {
            for (String columns : rows) {
                System.out.print(columns+" ");
            }
            System.out.println();
        }
    }
}
