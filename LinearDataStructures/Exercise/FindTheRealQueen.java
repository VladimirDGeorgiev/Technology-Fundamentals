package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheRealQueen {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[][] matrix = new String[8][];
        for (int i = 0; i < 8; i++) {
            matrix[i] = reader.readLine().split("\\s+");
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c].equals("q")) {
                    //col and rows
                    boolean isItOneQueen = true;
                    int counterCol = 0;
                    int counterRow = 0;
                    for (int i = 0; i < matrix.length; i++) {
                        //col check
                        if (matrix[i][c].equals("q")) {
                            counterCol++;
                            if (counterCol >= 2) {
                                isItOneQueen = false;
                                break;
                            }
                        }
                        //row check
                        if (matrix[r][i].equals("q")) {
                            counterRow++;
                            if (counterRow >= 2) {
                                isItOneQueen = false;
                                break;
                            }
                        }
                    }
                    if (!isItOneQueen) {
                        continue;
                    }
                    //up left diagonal check
                    int row = r;
                    int col = c;
                    while (true) {
                        row--;
                        col--;
                        if (row < 0 || col < 0) {
                            break;
                        }else{
                            if (matrix[row][col].equals("q")){
                                isItOneQueen=false;
                                break;
                            }
                        }
                    }
                    if (!isItOneQueen){
                        continue;
                    }
                    //up right diagonal check
                    row = r;
                    col = c;
                    while (true) {
                        row--;
                        col++;
                        if (row < 0 || col >=matrix.length) {
                            break;
                        }else{

                            if (matrix[row][col].equals("q")){
                                isItOneQueen=false;
                                break;
                            }
                        }
                    }
                    if (!isItOneQueen){
                        continue;
                    }
                    //down left diagonal check;
                    row = r;
                    col = c;
                    while (true) {
                        row++;
                        col--;
                        if (row >= matrix.length || col<0) {
                            break;
                        }else{
                            if (matrix[row][col].equals("q")){
                                isItOneQueen=false;
                                break;
                            }
                        }
                    }
                    if (!isItOneQueen){
                        continue;
                    }
                    //down right diagonal check
                    while (true) {
                        row++;
                        col++;
                        if (row >= matrix.length || col>=matrix.length) {
                            break;
                        }else{

                            if (matrix[row][col].equals("q")){
                                isItOneQueen=false;
                                break;
                            }
                        }
                    }
                    if (isItOneQueen){
                        System.out.println(r+" "+c);
                        return;
                    }


                }
            }
        }
    }
}
