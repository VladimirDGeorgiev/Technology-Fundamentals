package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%(?:[^|$%.]*)<(?<item>[^<>]+)>(?:[^|$%.]*)\\|(?:[^|$%.]*?)(?<quntity>\\d+)\\|(?:[^|$%.]*?)(?<price>[-+]?[0-9]+\\.[0-9]+|[0-9]+)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end of shift")){
            Matcher matcher = pattern.matcher(command);
            while (matcher.find()){
                String name = matcher.group("name");
                String item = matcher.group("item");
                int quntity = Integer.parseInt(matcher.group("quntity"));
                double price = Double.parseDouble(matcher.group("price"));
                totalSum+=price*quntity;
                System.out.println(String.format("%s: %s - %.2f",name,item,price*quntity));
            }

            command = scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f",totalSum));
    }
}
