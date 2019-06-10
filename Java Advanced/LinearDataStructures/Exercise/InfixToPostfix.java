package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class InfixToPostfix {
    public static void main(String[] args) throws IOException {
        //for each token in the postfix expression:
        //  if token is an operator:
        //    operand_2 ← pop from the stack
        //    operand_1 ← pop from the stack
        //    result ← evaluate token with operand_1 and operand_2
        //    push result back onto the stack
        //  else if token is an operand:
        //    push token onto the stack
        //result ← pop from the stack
        //((15 ÷ (7 − (1 + 1))) × 3) − (2 + (1 + 1)) --- >> 15 7 1 1 + − ÷ 3 × 2 1 1 + + −
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String infix = reader.readLine().replace(" ","");
        ArrayDeque<Character> operatorStack = new ArrayDeque<>();
        ArrayDeque<Character> operandStack = new ArrayDeque<>();
        for (int i = 0; i < infix.length(); i++) {
            char item = infix.charAt(i);
            boolean pendingOperand = true;
            if (Character.isDigit(item)){
                operatorStack.push(item);
                pendingOperand = false;
            }else if (item=='-'||item=='+'||item=='*'||item=='/'){
                operandStack.push(item);
            }

        }
    }
}
