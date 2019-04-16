import java.util.Scanner;

public class TownInfo {
    private int area;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int areaTown = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("Town %s has population of %d and area %d square km."
        ,townName,population,areaTown));

    }
}
