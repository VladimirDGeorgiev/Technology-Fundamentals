package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursiveFibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(reader.readLine());
        long firstNum = 1;
        long secondNum = 1;
        for (long i = 0; i < n; i++) {
            long temp = secondNum;
            secondNum+=firstNum;
            firstNum = temp;
        }
        System.out.println(firstNum);
    }
}
