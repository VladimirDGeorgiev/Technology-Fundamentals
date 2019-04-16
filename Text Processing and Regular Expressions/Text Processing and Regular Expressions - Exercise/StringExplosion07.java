package TextProcessingandRegularExpressions.Exers;

import java.util.Scanner;

public class StringExplosion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int bombPower = 0;
        boolean start = false;
        for (int i = 0; i <input.length() ; i++) {
            if (start){
                bombPower+=Integer.parseInt(String.valueOf(input.charAt(i)))-1;////abv>1>1>2>2asdasd
                start=false;
            }else {
                if (String.valueOf(input.charAt(i)).equals(">")) {
                    start = true;
                    result.append(input.charAt(i));
                } else if(bombPower==0){
                    result.append(input.charAt(i));
                }else if (bombPower>0){
                    bombPower--;
                }
            }
        }
        System.out.println(result);
    }
}
