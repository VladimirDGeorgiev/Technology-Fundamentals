package metodsMoreExersays;
import java.util.Scanner;

public class ChristmasSpirit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalSpirit = 0;
        int totalCost = 0;
        for (int i = 1; i <=days ; i++) {

            if(i%11==0){
                quantity += 2;
            }
            if(i% 10==0) {
                totalSpirit -= 20;
                totalCost += 5 + 3 + 15;
            // if (i == 10) {
            //     totalSpirit -= 30;///Also if the last day is a tenth day
                //                      (move da e vseki posleden den kojto se deli na 10)
                //                      the cat decides to demolish even more and ruins the Christmas turkey
                //                      and you lose additional 30 spirit.
            // }
            }
            if(i%5==0){
                totalCost += 15*quantity;
                totalSpirit+=17;
                if(i%3==0){
                    totalSpirit+=30;
                }
            }
            if (i % 3 == 0) {
                totalCost +=5*quantity + 3*quantity;
                totalSpirit+=13;
            }
            if(i%2==0){
                totalCost+=2*quantity;
                totalSpirit+=5;
            }
        }
        if (days%10==0){    // tyi kato proverkata se otnasq za dnite kato cqlo
            totalSpirit-=30;// a ne za vseki den tq move da e izvyn cikala
        }                   // daje ako e v cikala na vseki 10 dena 6te vadi 30
                            // koeto ne e korektno
        System.out.println("Total cost: " + totalCost);
        System.out.println("Total spirit: " + totalSpirit);

    }
}
//P.P.  Uslovieto be6e mnogo typo napisano i tova po4eti ne se razbira6e 4e trqbva taka da se napravi !!!