package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int add = Integer.parseInt(input[0]);
        int remove = Integer.parseInt(input[1]);
        int present =Integer.parseInt(input[2]);

        int[] data = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i <add ; i++) {
            if (i<data.length)
            queue.add(data[i]);
        }
        for (int i = 0; i <remove ; i++) {
            if (!queue.isEmpty())
            queue.poll();
        }
        if (queue.contains(present)){
            System.out.println(true);
        }else{
            if (queue.isEmpty()){
                System.out.println(0);
                return;
            }
            int min = Integer.MAX_VALUE;
            for (Integer element : queue) {
                if (element<min){
                    min=element;
                }
            }
            System.out.println(min);
        }
    }
}
