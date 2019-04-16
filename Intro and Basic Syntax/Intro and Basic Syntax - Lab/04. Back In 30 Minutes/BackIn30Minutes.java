import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        double sum = (hours*60)+(minutes+30);

        double hours30 = (int) Math.floor(sum/60);
        int minute30 = (int)sum%60;


        if (hours30==24){
            hours30=0;
        }
        System.out.println(String.format("%.0f:%02d",hours30,minute30));


    }
}
