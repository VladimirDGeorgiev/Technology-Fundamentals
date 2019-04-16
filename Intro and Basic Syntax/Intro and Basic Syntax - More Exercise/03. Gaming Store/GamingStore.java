import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double referbudget=budget;

        String command = scanner.nextLine();
        while (!command.equals("Game Time")) {
            switch (command) {
                case "OutFall 4":
                    if (budget >= 39.99) {
                        System.out.println(String.format("Bought %s",command));
                        budget -= 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (budget >= 15.99) {
                        System.out.println(String.format("Bought %s",command));
                        budget -= 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        System.out.println(String.format("Bought %s",command));
                        budget -= 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (budget >= 59.99) {
                        System.out.println(String.format("Bought %s",command));
                        budget -= 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (budget >= 29.99) {
                        System.out.println(String.format("Bought %s",command));
                        budget -= 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (budget >= 39.99) {
                        System.out.println(String.format("Bought %s",command));
                        budget -= 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                default:
                    System.out.println("Not Found");
                    break;

            }
            if (budget == 0) {
                System.out.println("Out of money!");
                return;
            }

            command = scanner.nextLine();
        }
        referbudget-=budget;
        System.out.println(String.format("Total spent: $%.2f. Remaining: $%.2f",referbudget,budget));
    }
}
