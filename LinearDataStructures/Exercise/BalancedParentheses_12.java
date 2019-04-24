package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        if (input.length%2!=0){
            System.out.println("NO");
            return;
        }
        ArrayDeque<String> data = new ArrayDeque<>();
        for (String s : input) {
            data.push(String.valueOf(Character.toChars(s.charAt(0))));

        }
        while (!data.isEmpty()){
            String element1 = data.pollLast();
            String element2 = data.pop();
            if ((element1.equals("[")&&element2.equals("]"))||
                    (element1.equals("{")&&element2.equals("}"))||
                    (element1.equals("(")&&element2.equals(")"))||
                    (element1.equals("]")&&element2.equals("["))||
                    (element1.equals("}")&&element2.equals("{"))||
                    (element1.equals(")")&&element2.equals("("))){
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
