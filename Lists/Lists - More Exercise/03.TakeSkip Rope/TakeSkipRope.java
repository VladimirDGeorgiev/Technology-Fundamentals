package ListExer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String numbers = input.replaceAll("[^0123456789]","");
        String lether = input.replaceAll("\\d","");
        List<String> take = new ArrayList<>();
        List<String> skip = new ArrayList<>();
        for (int i = 0; i <numbers.length() ; i++) {
            if (i%2==0){
                take.add(String.valueOf(numbers.charAt(i)));
            }else{
                skip.add(String.valueOf(numbers.charAt(i)));
            }
        }
        List<String> letherList = Arrays.stream(lether.split("")).collect(Collectors.toList());
        String result = "";
        int n = Math.min(take.size(),skip.size());
        for (int i = 0; i < n; i++) {
            result+=addText(letherList,Integer.parseInt(take.get(i)));
            removeFromList(letherList,Integer.parseInt(take.get(i))+Integer.parseInt(skip.get(i)));
        }

        System.out.println(result);

    }

    private static void removeFromList(List<String> letherList, int endIndex) {
        if (letherList.size()<endIndex){
            endIndex=letherList.size()-1;
        }
        for (int i = 0; i <endIndex ; i++) {
            letherList.remove(0);
        }
    }

    private static String addText(List<String> letherList, int endIndex) {
        String lether = "";
        if (letherList.size()<endIndex){
            endIndex=letherList.size();
        }
        for (int i = 0; i <endIndex ; i++) {
            lether+=letherList.get(i);
        }
        return lether;
    }
}
