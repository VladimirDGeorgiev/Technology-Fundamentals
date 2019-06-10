package JavaAdvanced.IntroToJava.Exercise;

import java.util.Scanner;

public class N11GameofNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String winingName= "";
        int resultScore =Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int score = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j <name.length() ; j++) {

                if (name.charAt(j)%2==0){
                    score+=name.charAt(j);
                }else{
                    score-=name.charAt(j);
                }
            }
            if (score>resultScore){
                resultScore=score;
                winingName=name;
            }
        }
        System.out.println(String.format("The winner is %s - %d points",winingName,resultScore));
    }
}
