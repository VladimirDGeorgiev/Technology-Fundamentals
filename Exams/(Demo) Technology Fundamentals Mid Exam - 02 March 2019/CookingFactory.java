package demoMidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CookingFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        int totalQuality = Integer.MIN_VALUE;
        int averageQuality=Integer.MIN_VALUE;
        int countElements=11;
        List<Integer> result = new ArrayList<>();
        while (!data.equals("Bake It!")){
            List<Integer> list = Arrays.stream(data.split("\\#+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            int sumTotalQuality=0;
            for (int i = 0; i <list.size(); i++) {
                sumTotalQuality+=list.get(i);
            }
            int sumElements=list.size();
            int sumAverageQuality = sumTotalQuality/sumElements;
            if (sumTotalQuality>totalQuality){
                totalQuality=sumTotalQuality;
                countElements=sumElements;
                averageQuality=sumAverageQuality;
                result = new ArrayList<>();
                result.addAll(list);
            }else if(sumTotalQuality==totalQuality){
                if (sumAverageQuality>averageQuality){
                    totalQuality=sumTotalQuality;
                    countElements=sumElements;
                    averageQuality=sumAverageQuality;
                    result = new ArrayList<>();
                    result.addAll(list);
                }else if(sumAverageQuality==averageQuality){
                    if (sumElements<countElements){
                        totalQuality=sumTotalQuality;
                        countElements=sumElements;
                        averageQuality=sumAverageQuality;
                        result = new ArrayList<>();
                        result.addAll(list);
                    }
                }

            }


            data = scanner.nextLine();
        }
        System.out.println(String.format("Best Batch quality: %d",totalQuality));
        System.out.println(result.toString().replaceAll("[\\[,\\]]",""));
    }
}
