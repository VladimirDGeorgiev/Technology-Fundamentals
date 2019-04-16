package ListExer;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());

        List<Integer> result = new ArrayList<>(0);
        int smallerSize = Math.min(firstList.size(),secondList.size());
        for (int i = 0; i <smallerSize ; i++) {
            result.add(firstList.get(i));
            result.add(secondList.get(i));


        }
        if (firstList.size()>secondList.size()){
            getBackIndex(firstList, secondList, result);

        }
        if (firstList.size()<secondList.size()){
            getBackIndex(secondList, firstList, result);

        }

        System.out.println(result.toString().replaceAll("\\[|,|\\]",""));

    }

    private static void getBackIndex(List<Integer> big, List<Integer> small, List<Integer> result) {
        for (int i = small.size(); i <big.size() ; i++) {
            result.add(big.get(i));
        }
    }
}
