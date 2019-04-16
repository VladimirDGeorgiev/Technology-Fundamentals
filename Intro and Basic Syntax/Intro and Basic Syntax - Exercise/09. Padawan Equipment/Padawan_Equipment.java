import java.util.Scanner;

public class Padawan_Equipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double students = Double.parseDouble(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double sumLightsabers = Math.ceil(students * 1.1) * lightsabers;
        double sumBelt = 0.0;

        if (students >= 6) {
            double freeBelt = Math.floor(students / 6);
            sumBelt = (students - freeBelt) * belts;

        } else {
            sumBelt = students * belts;
        }
        double sumRobes = students * robes;
        double finaleSum = sumBelt + sumLightsabers + sumRobes;

        if (finaleSum <= money) {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", finaleSum));
        } else {
            System.out.println(String.format("Ivan Cho will need %.2flv more.", finaleSum - money));

        }
    }
}
