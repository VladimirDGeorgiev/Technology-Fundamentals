package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<item>\\w+)<<(?<price>[-+]?[0-9]+\\.?[0-9]*)!(?<quntity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        String command = scanner.nextLine();
        double sum = 0;
        System.out.println("Bought furniture:");
        while (!command.equalsIgnoreCase("Purchase")){

            Matcher matcher = pattern.matcher(command);
            while (matcher.find()){
                double price = Double.parseDouble(matcher.group("price"));
                int quntity = Integer.parseInt(matcher.group("quntity"));
                sum+=price*quntity;
                System.out.println(matcher.group("item"));
            }
            command = scanner.nextLine();
        }
        System.out.println(String.format("Total money spend: %.2f",sum));
    }
}
