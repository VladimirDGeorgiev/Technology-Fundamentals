import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte centuries = Byte.parseByte(scanner.nextLine());
        int years =100*centuries;
        int days =(int)(365.2422*years) ;
        int hours =24*days;
        long minites = 60*hours;

        System.out.println(String.format("%d centuries = %d years = %d days = %d hours = %d minutes",
                centuries,
                years,
                days,
                hours,
                minites));


    }
}
