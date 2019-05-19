package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e06Crossfire {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] dimension = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimension[0];
        int cols = dimension[1];

        List<List<Integer>> matrix = new ArrayList<>();

        int count = 1;

        for (int r = 0; r < rows; r++) {
            matrix.add(new ArrayList<>());
            for (int c = 0; c < cols; c++) {
                matrix.get(r).add(count++);
            }
        }

        String line = "";

        while (!(line=reader.readLine()).equals("Nuke it from orbit")){
            String[] data = line.split(" ");

            int bombRow = Integer.parseInt(data[0]);
            int bombCol = Integer.parseInt(data[1]);
            int BombPower = Integer.parseInt(data[2]);

            for (int i = bombRow - BombPower; i <= bombRow + BombPower; i++) {
                if (rangeCheck(i, bombCol, matrix) && i != bombRow){
                    matrix.get(i).remove(bombCol);
                }
            }

            for (int j = bombCol + BombPower; j >= bombCol - BombPower; j--) {
                if (rangeCheck(bombRow, j, matrix)){
                    matrix.get(bombRow).remove(j);
                }
            }

            matrix.removeIf(List::isEmpty);

        }

        for(List<Integer> row : matrix){
            for (Integer e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }



    }

    private static boolean rangeCheck(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}
