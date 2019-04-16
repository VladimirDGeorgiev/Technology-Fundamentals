package metodsMoreExersays;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        double xResult = getDiagonal(x1, x2);
        double yResult = getDiagonal(y1, y2);
        if (xResult<yResult){
            System.out.println(String.format("(%d, %d)",x1,x2));
        }else{
            System.out.println(String.format("(%d, %d)",y1,y2));
        }
    }

    public static double getDiagonal(int x1, int x2) {
        return Math.pow((x1 * x1) + (x2 * x2), 0.5);
    }
}
