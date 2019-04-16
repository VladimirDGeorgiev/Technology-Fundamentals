package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        double left = 0;
        double right = 0;
        for (int i = 0 ; i <(numList.size()/2); i++) {
            if (numList.get(i)==0){
                left=left*0.8;
            }else{
                left+=numList.get(i);
            }
            if (numList.get(numList.size()-1-i)==0){
                right=right*0.8;
            }else{
                right+=numList.get(numList.size()-1-i);
            }


        }
        if (left<right){
            System.out.println(String.format("The winner is left with total time: %.1f",left));
        }else{
            System.out.println(String.format("The winner is right with total time: %.1f",right));
        }
    }
}
