package JavaOOp.IteratorsAndComparators.Exercises.StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyStack myStack = new MyStack();
        String line;
        while (true) {

            if ("END".equals(line = br.readLine())) {
                break;
            }
            String[] token = Arrays.stream(line.split("\\s+"))
                    .map(e -> e.replace(",", "")).toArray(String[]::new);

            switch (token[0]) {
                case "Push":
                    int[] num = Arrays.stream(token).skip(1).mapToInt(Integer::parseInt).toArray();
                    for (int i : num) {
                        myStack.push(i);
                    }
                    break;
                case "Pop":
                    try {
                        myStack.pop();
                    } catch (NoSuchElementException nsee) {
                        System.out.println(nsee.getMessage());
                    }
                    break;
                default:
                    break;
            }
        }
        for (Object o : myStack) {
            System.out.println(o);
        }
        for (Object o : myStack) {
            System.out.println(o);
        }
    }

}
