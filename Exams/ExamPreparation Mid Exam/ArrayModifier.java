package PreparetioForMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")){
            String[] data = command.split("\\s+");

            switch (data[0].toLowerCase()){
                case "swap":
                    int index1 =Integer.parseInt( data[1]);
                    int index2 =Integer.parseInt( data[2]);
                    int temp = input.get(index1);
                    input.set(index1,input.get(index2));
                    input.set(index2,temp);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(data[1]);
                    index2 = Integer.parseInt( data[2]);
                    input.set(index1,input.get(index1)*input.get(index2));
                    break;
                case "decrease":
                    for (int i = 0; i <input.size() ; i++) {
                        input.set(i,input.get(i)-1);
                    }
                    break;
                default:
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(input.toString().replaceAll("[\\[\\]]",""));
    }
}
