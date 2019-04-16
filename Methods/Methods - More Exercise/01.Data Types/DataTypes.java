package metodsMoreExersays;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("int")){
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(number*2);
        }else if (input.equals("real")){
            double number = Double.parseDouble(scanner.nextLine());
            System.out.println(String.format("%.2f",number*1.5));
        }
        else if (input.equals("string")){
            System.out.println(String.format("$%s$",scanner.nextLine()));
        }
    }


}
