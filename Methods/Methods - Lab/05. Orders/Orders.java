import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        order(product,quantity);

    }
    static void order (String product,double quantity){
        switch (product){
            case"coffee":
                System.out.printf(String.format("%.2f",quantity*1.5));break;
            case"water":
                System.out.printf(String.format("%.2f",quantity*1));break;
            case"coke":
                System.out.printf(String.format("%.2f",quantity*1.4));break;
            case"snacks":
                System.out.printf(String.format("%.2f",quantity*2));break;
        }

    }
}
