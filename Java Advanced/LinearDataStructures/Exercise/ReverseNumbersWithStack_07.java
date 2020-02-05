package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            stack.push(Integer.parseInt(s));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");

        }

    }
}

