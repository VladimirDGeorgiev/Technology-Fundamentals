package demoMidExam;

import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());
        int freePackege = students/5;
        double sum = (priceApron*(Math.ceil(students*1.2)))
                +(priceEgg*10*students)
                +(priceFlour*(students-freePackege));
        if (sum<=budget){
            System.out.println(String.format("Items purchased for %.2f$.",sum));
        }else{
            System.out.println(String.format("%.2f$ more needed.",sum-budget));

        }
    }
}
