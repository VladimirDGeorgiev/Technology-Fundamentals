package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class e10ReverseMatrixDiagonals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixSize = reader.readLine().split("\\s+");
        int matrixRows =Integer.parseInt(matrixSize[0]);
        int matrixCols =Integer.parseInt(matrixSize[1]);


        List<ArrayDeque<String>> matrix = new ArrayList<>();
        for (int i = 0; i <matrixRows ; i++) {
            String[] input  = reader.readLine().split("\\s+");
            matrix.add(i,new ArrayDeque<>());
            for (int j = 0; j < input.length; j++) {
                matrix.get(i).push(input[j]);
            }
        }
        System.out.println();
        //21 20 18 15
        //19 17 14 12
        //16 13 11 10

        //10
        //11 12
        //13 14 15
        //16 17 18
        //19 20
        //21
        for (int row = matrixRows-1; row >=0 ; row--) {

        }


    }
}
