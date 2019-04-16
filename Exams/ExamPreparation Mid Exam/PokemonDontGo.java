package PreparetioForMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        int sum = 0;
        while (!input.isEmpty()){
            int index = Integer.parseInt(scanner.nextLine());

            if (index>=0&&index<input.size()){
                int value = input.get(index);
                sum+=input.get(index);
                setListValue(input, value);
                input.remove(index);

            }else if (index<0){
                index=0;
                int value = input.get(index);
                sum+=input.get(index);
                setListValue(input, value);
                input.set(0,input.get(input.size()-1));

            }else if (index>=input.size()){
                index=input.size()-1;
                int value = input.get(index);
                sum+=input.get(index);
                setListValue(input, value);
                input.set(input.size()-1,input.get(0));

            }
        }
        System.out.println(sum);
    }

    public static void setListValue(List<Integer> input, int value) {
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) <= value) {
                input.set(i, input.get(i) + value);
            } else {
                input.set(i, input.get(i) - value);
            }
        }
    }
}
