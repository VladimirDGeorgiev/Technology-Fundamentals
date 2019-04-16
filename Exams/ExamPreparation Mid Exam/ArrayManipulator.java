package PreparetioForMidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")){
            String[] data = command.split("\\s+");

            switch (data[0].toLowerCase()){
                case "exchange":                                // възможен проблем
                    int index = Integer.parseInt(data[1]);
                    if (index>=0&&index<input.size()){
                        Collections.rotate(input,input.size()-1-index);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (data[1].equalsIgnoreCase("even")){
                        int maxEven = Integer.MIN_VALUE;
                        for (int i = 0; i <input.size() ; i++) {
                            if (input.get(i)%2==0){
                                if (input.get(i)>maxEven){
                                    maxEven=input.get(i);
                                }
                            }
                        }
                    }else if (data[1].equalsIgnoreCase("odd")){
                        int maxOdd = Integer.MIN_VALUE;

                    }
                    break;
                case "min":
                    break;
                case "first":
                    break;
                case "last":
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(input.toString());
    }
}
