package LinearDataStructures.Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\((\\d+)\\)";
        Pattern pattern = Pattern.compile(regex);
        String rotationInput = scanner.nextLine();
        Matcher matcher = pattern.matcher(rotationInput);
        int rotation = 0;
        if (matcher.find()){
            rotation =Integer.parseInt(matcher.group(1));
        }
        String input = scanner.nextLine();
        ArrayList<String> inputdata = new ArrayList<>();
        int maxMatrixColumn = 0;
       while (!input.equalsIgnoreCase("end")){
           if (maxMatrixColumn<input.length()){
               maxMatrixColumn=input.length();
           }
           inputdata.add(input);
           input = scanner.nextLine();
       }

       Character[][] matrix = new Character[inputdata.size()][maxMatrixColumn];
        for (int row = 0; row < inputdata.size(); row++) {
            for (int column = 0; column <inputdata.get(row).length() ; column++) {
                matrix[row][column]= inputdata.get(row).charAt(column);
            }
        }
        rotation=rotation%360;
        if (rotation%360==0||rotation==0){
            printMatrixWithoutRotation(matrix);
        }else if(rotation%270==0){
            printMatrixRotation270Deg(matrix);

        }else if(rotation%180==0){
            printMatrixRotation180Deg(matrix);
        }else if(rotation%90==0){
            printMatrixRotation90Deg(matrix);
        }
    }

    private static void printMatrixRotation90Deg(Character[][] matrix) {
        for (int columns = 0; columns <matrix[0].length ; columns++) {
            for (int rows =matrix.length-1; rows >=0 ; rows--) {
                if (matrix[rows][columns]!=null){
                    System.out.print(matrix[rows][columns]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printMatrixRotation180Deg(Character[][] matrix) {
        for (int rows = matrix.length-1; rows >= 0; rows--) {
            for (int columns = matrix[0].length-1; columns >=0; columns--) {
                if (matrix[rows][columns]!=null){
                    System.out.print(matrix[rows][columns]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printMatrixRotation270Deg(Character[][] matrix) {
        for (int columns = matrix[0].length-1; columns >=0; columns--) {
            for (int rows = 0; rows < matrix.length; rows++) {
                if (matrix[rows][columns]!=null){
                    System.out.print(matrix[rows][columns]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printMatrixWithoutRotation(Character[][] matrix) {
        for (Character[] rows : matrix) {
            for (Character columns : rows) {
                if (columns!=null) {
                    System.out.print(columns);
                }
            }
            System.out.println();
        }
    }

}
