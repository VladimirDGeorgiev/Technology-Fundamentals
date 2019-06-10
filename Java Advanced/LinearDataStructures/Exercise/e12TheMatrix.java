package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class e12TheMatrix {
    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split("\\s+");
        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        char[][] matrix = new char[rows][cols];

        fillTheMatrix(reader, rows, cols, matrix);

        char fillChar = reader.readLine().charAt(0);
        String[] cordinatesOfFillChar = reader.readLine().split("\\s+");
        int startRow =Integer.parseInt(cordinatesOfFillChar[0]);
        int startCol =Integer.parseInt(cordinatesOfFillChar[1]);
        char startChar =matrix[startRow][startCol];
        matrix[startRow][startCol]=fillChar;
        Deque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[]{startRow,startCol});
        matrixFillWithNewChar(matrix,stack,fillChar,startChar);
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] rows : matrix) {
            for (char e : rows) {
                System.out.print(e);
            }
            System.out.println();
        }
    }

    private static void matrixFillWithNewChar(char[][] matrix, Deque<int[]> stack, char fillChar, char startChar) {
        int[] currentPosition =  stack.peek();
        int row = currentPosition[0];
        int col = currentPosition[1];
        if (row-1>=0) {
            if (matrix[row - 1][col] == startChar) {
                stack.push(new int[]{row - 1, col});
                matrix[row - 1][col] = fillChar;
                matrixFillWithNewChar(matrix, stack, fillChar, startChar);
            }
        }
        if (row+1<matrix.length) {
            if (matrix[row + 1][col] == startChar) {
                stack.push(new int[]{row + 1, col});
                matrix[row + 1][col] = fillChar;
                matrixFillWithNewChar(matrix, stack, fillChar, startChar);
            }
        }
        if (col-1>=0) {
            if (matrix[row][col - 1] == startChar ) {
                stack.push(new int[]{row, col - 1});
                matrix[row][col - 1] = fillChar;
                matrixFillWithNewChar(matrix, stack, fillChar, startChar);
            }
        }
        if (col+1<matrix[row].length) {
            if (matrix[row][col + 1] == startChar) {
                stack.push(new int[]{row, col + 1});
                matrix[row][col + 1] = fillChar;
                matrixFillWithNewChar(matrix, stack, fillChar, startChar);
            }
        }
        stack.pop();
    }


    private static void fillTheMatrix(BufferedReader reader, int rows, int cols, char[][] matrix) throws IOException {
        for (int r = 0; r < rows; r++) {
           String[] data = reader.readLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = data[c].charAt(0);
            }
        }
    }

}
