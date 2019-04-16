import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long nPokePower = Integer.parseInt(scanner.nextLine());
        int mDistance = Integer.parseInt(scanner.nextLine());
        int yExhaustion = Integer.parseInt(scanner.nextLine());
        int count = 0;
        long exhaustionRaiting=0;
        if (nPokePower%2==0) {
            exhaustionRaiting = nPokePower / 2;
        }
        while (mDistance<=nPokePower){
            count++;
            nPokePower-=mDistance;
            if (nPokePower==exhaustionRaiting&&nPokePower>=yExhaustion&&yExhaustion!=0){
                nPokePower/=yExhaustion;

            }
        }
        System.out.println(nPokePower);
        System.out.println(count);
    }
}
