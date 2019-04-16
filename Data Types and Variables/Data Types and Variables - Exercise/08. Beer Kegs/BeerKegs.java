import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String winner = "";
        double volume=0.0;


        for (int i = 0; i <n ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double sum = Math.PI*radius*radius*height;

            if (sum>volume){
                volume=sum;
                winner=model;
            }



        }
        System.out.println(winner);
    }
}
