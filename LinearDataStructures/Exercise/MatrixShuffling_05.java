package LinearDataStructures.Exercise;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;

public class MatrixShuffling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = scanner.nextLine().split(" ");
        int r = Integer.parseInt(dimensions[0]);
        int c = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[r][c];

        for (int row = 0; row < r; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int columb = 0; columb < c; columb++) {
                matrix[row][columb] = input[columb];
            }
        }
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("END")) {
            if (command.contains("swap")) {
                String[] data = command.split(" ");
                if (data.length == 5) {
                    int row1 = Integer.parseInt(data[1]);
                    int col1 = Integer.parseInt(data[2]);
                    int row2 = Integer.parseInt(data[3]);
                    int col2 = Integer.parseInt(data[4]);
                    if (row1<r&&row2<r&&
                            row1>=0&&row2>=0&&
                            col1<c&&col2<c&&
                            col1>=0&&col2>=0){
                        String temp = matrix[row1][col1];
                        matrix[row1][col1]=matrix[row2][col2];
                        matrix[row2][col2]=temp;
                        for (String[] rows : matrix) {
                            for (String columns : rows) {
                                System.out.print(columns+" ");
                            }
                            System.out.println();
                        }


                    }else{
                        System.out.println("Invalid input!");
                    }


                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }
}
