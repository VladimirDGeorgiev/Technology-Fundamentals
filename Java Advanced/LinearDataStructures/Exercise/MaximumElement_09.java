package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.contains("1")) {
                String[] data = input.split(" ");
                stack.push(data[1]);
            } else if (input.equals("2")) {
                stack.pop();
            } else if (input.equals("3")) {
                if (!stack.isEmpty()) {
                    int max = Integer.MIN_VALUE;
                    for (String elements : stack) {

                        if (Integer.parseInt(elements)>max){
                            max=Integer.parseInt(elements);
                        }
                    }
                    System.out.println(max);
                }
            }
        }
    }
}
