package metodsMoreExersays;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        double first = getDiagonal(x1,x2)+getDiagonal(y1,y2);
        double second = getDiagonal(a1,a2)+getDiagonal(b1,b2);
        if(first>=second){
            printing(x1, x2, y1, y2);
        }else{
            printing(a1, a2, b1, b2);
        }
    }

    public static void printing(int x1, int x2, int y1, int y2) {
        if (getDiagonal(x1, x2) < getDiagonal(y1, y2)) {
            System.out.print(String.format("(%d, %d)", x1, x2));
            System.out.print(String.format("(%d, %d)", y1, y2));
        } else {
            System.out.print(String.format("(%d, %d)", y1, y2));
            System.out.print(String.format("(%d, %d)", x1, x2));
        }
    }

    public static double getDiagonal(int x1, int x2) {
        return Math.pow((x1 * x1) + (x2 * x2), 0.5);
    }
}
