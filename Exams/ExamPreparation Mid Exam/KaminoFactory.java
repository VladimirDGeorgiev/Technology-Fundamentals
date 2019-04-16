package PreparetioForMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        List<String> dataInput = new ArrayList<>();
        List<String> result = new ArrayList<>();
        int bestDNAsempal = 0;
        int longestSequensResult =0;
        int resultSempal = 0;
        int resultSum = 0;
        int resultStartIndex= 5;
        while (!input.equals("Clone them!")) {
            dataInput = Arrays.stream(input.split("\\!+")).collect(Collectors.toList());
            bestDNAsempal++;
            int sum = 0;
            int startIndex = -1;
            int longestSequens = 1;
            boolean startIndexfalse = true;
            for (int i = 0; i < dataInput.size(); i++) {
                if (dataInput.get(i).equals("1")) {
                    sum++;
                    if (i < dataInput.size() - 1) {
                        if (dataInput.get(i).equals(dataInput.get(i + 1))) {
                            longestSequens++;
                            if (startIndexfalse) {
                                startIndexfalse = false;
                                startIndex = i;
                            }
                        }
                    }
                }
            }
            if (longestSequens>longestSequensResult){
                result = printOutput(dataInput);
                resultStartIndex=startIndex;
                longestSequensResult=longestSequens;
                resultSempal=bestDNAsempal;
                resultSum = sum;
            }else if (longestSequens==longestSequensResult){
                    if (startIndex<resultStartIndex){
                        result = printOutput(dataInput);
                        longestSequensResult=longestSequens;
                        resultStartIndex=startIndex;
                        resultSempal=bestDNAsempal;
                        resultSum = sum;
                    }else if (startIndex==resultStartIndex){
                        if (sum>resultSum){
                            result = printOutput(dataInput);
                            longestSequensResult=longestSequens;
                            resultStartIndex=startIndex;
                            resultSempal=bestDNAsempal;
                            resultSum = sum;
                        }
                    }
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.",resultSempal,resultSum));
        System.out.println(result.toString().replaceAll("[\\[,\\]]",""));
    }

    public static List<String> printOutput(List<String> dataInput) {
        List<String> result;
        result = new ArrayList<>();
        for (String i : dataInput) {
            result.add(i);
        }
        return result;
    }
}
