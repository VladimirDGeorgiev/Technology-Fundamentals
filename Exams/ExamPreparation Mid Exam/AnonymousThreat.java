package PreparetioForMidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String > input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine().toLowerCase();
        while (!command.equals("3:1")){
            String[] data = command.split("\\s+");
            if (data[0].equals("merge")){
                int startIndex = Integer.parseInt(data[1]);
                int endIndex = Integer.parseInt(data[2]);
                if (startIndex<0){
                    startIndex=0;
                }
                if (endIndex>=input.size()){
                    endIndex=input.size()-1;
                }
                for (int i = startIndex; i <endIndex ; i++) {
                    input.set(i,input.get(i)+input.get(i+1));
                    input.remove(i+1);
                    endIndex--;
                    i--;
                }
            }else if(data[0].equals("divide")){
                int index = Integer.parseInt(data[1]);
                int partitions = Integer.parseInt(data[2]);
                List<String> result = divedeEqually(input.get(index),partitions);
                input.remove(index);
                input.addAll(index,result);
            }

            command = scanner.nextLine();
        }
        System.out.println(input.toString().replaceAll("[\\[,\\]]", ""));
    }

    private static List<String> divedeEqually(String element, int partitions) {
        int part =element.length()/partitions;
        List<String> result = new ArrayList<>();
        while (element.length()!=0){
            if (element.length()>=part){
                result.add(element.substring(0,part));
                element=element.substring(part);
            }else{
                result.add(element);
                element=element.substring(element.length());
            }
        }
        if (result.size()==partitions){
            return result;
        }else{
            String concatLastTwoElenets = result.get(result.size()-2).concat(result.get(result.size()-1));
            result.subList(result.size()-2,result.size()).clear();
            result.add(concatLastTwoElenets);
            return result;
        }
    }
}
