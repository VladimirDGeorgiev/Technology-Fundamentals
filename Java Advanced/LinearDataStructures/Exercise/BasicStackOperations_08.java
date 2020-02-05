package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStack = scanner.nextLine().split(" ");
        int numberOfElements = Integer.parseInt(inputStack[0]);
        int numberOfPop =Integer.parseInt(inputStack[1]);
        int presentInTheStack =Integer.parseInt(inputStack[2]);

        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String element : numbers) {
            stack.push(Integer.parseInt(element));
        }
        for (int i = 0; i <numberOfPop ; i++) {
            stack.pop();
        }
        if (stack.contains(presentInTheStack)){
            System.out.println(true);
        }else{
            int smallestElement = Integer.MAX_VALUE;
            if (stack.isEmpty()){
                System.out.println(0);
                return;
            }
            while (!stack.isEmpty()){
                if (stack.peek()<smallestElement){
                    smallestElement=stack.peek();
                }
                stack.pop();
            }
            System.out.println(smallestElement);
        }

    }
}
