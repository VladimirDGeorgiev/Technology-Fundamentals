package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length()%2!=0){
            System.out.println("NO");
            return;
        }
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <input.length(); i++) {
            char parenthes = input.charAt(i);
            if (parenthes=='('){
                stack.push(1);
            }else if (parenthes=='{'){
                stack.push(2);
            }else if (parenthes=='['){
                stack.push(3);
            }
            if (parenthes==')'){
                if (stack.peek()==1){
                    stack.pop();
                }
            }else if (parenthes=='}'){
                if (stack.peek()==2){
                    stack.pop();
                }
            }else if (parenthes==']') {
                if (stack.peek() == 3) {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
