package StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoundedNumbers_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        int firstBound = Integer.valueOf(input[0]);
        int secondBound = Integer.valueOf(input[1]);
        int lolerBound = Math.min(firstBound,secondBound);
        int upperBound= Math.max(firstBound,secondBound);
        List<Integer> nums = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (Integer num : nums) {
            if (num>=lolerBound&&num<=upperBound){
                System.out.print(num+" ");
            }
        }
    }
}
