import java.net.SocketOption;
import java.util.Scanner;
import java.util.SortedMap;

public class Vending_Machine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double sum = 0.0;

        while (!command.equals("Start")) {
            double cast=Double.parseDouble(command);
            if (cast==0.1||cast==0.2||cast==0.5||cast==1||cast==2){
                sum+=cast;
            }
            else{
                System.out.println(String.format("Cannot accept %.2f",cast));
            }

            command=scanner.nextLine();

        }

        String secondCommand = scanner.nextLine();

        while (!secondCommand.equals("End")){

            switch (secondCommand){
                case "Nuts":
                    if (sum>=2){
                    sum-=2;System.out.println(String.format("Purchased %s",secondCommand));
                }
                 else{
                     System.out.println("Sorry, not enough money");
                    }   break;
                case "Water":
                    if (sum>=0.7){
                        sum-=0.7;System.out.println(String.format("Purchased %s",secondCommand));
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }   break;
                case "Crisps":
                    if (sum>=1.5){
                        sum-=1.5;System.out.println(String.format("Purchased %s",secondCommand));
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }   break;
                case "Soda":
                    if (sum>=0.8){
                        sum-=0.8;System.out.println(String.format("Purchased %s",secondCommand));
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }   break;
                case "Coke":
                    if (sum>=1){
                        sum-=1;System.out.println(String.format("Purchased %s",secondCommand));
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }   break;

                default:
                    System.out.println("Invalid product");
                    break;
            }
            secondCommand=scanner.nextLine();

        }

        System.out.println(String.format("Change: %.2f",sum));

    }
}