import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        int sum =(int) rectangleArea(a,b);
        System.out.println(sum);

    }
    static double rectangleArea(double width, double length){

        double sum = width*length;
        return sum;
    }

}
