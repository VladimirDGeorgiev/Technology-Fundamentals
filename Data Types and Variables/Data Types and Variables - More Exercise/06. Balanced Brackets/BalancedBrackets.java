import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counterSumOpen = 0;
        int counterSumClose=0;
        boolean unBalance = true;
        boolean open = false;
        boolean close = false;

        for (int i = 0; i <n ; i++) {
            String command = scanner.nextLine();
            if (command.contains("(")){
                if (open){
                    unBalance=false;
                }
                open=true;
                close=false;

                counterSumOpen++;
            }
            if (command.contains(")")){
                if (close){
                    unBalance=false;
                }
                close =true;
                open = false;

                counterSumClose++;
            }

        }
        if (counterSumClose==counterSumOpen&&unBalance){
            System.out.println("BALANCED");
        }
        else{
            System.out.println("UNBALANCED");
        }

    }
}
