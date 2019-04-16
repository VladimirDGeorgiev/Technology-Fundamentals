package ListExer;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MixedupLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        List<Integer> b = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        int n = Math.max(a.size(),b.size());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            if (i<a.size()) {
                result.add(a.get(i));//0 1 2 3 4 5
            }else{
                continue;
            }
            if (b.size()-1-i>0) {
                result.add(b.get(b.size()-1-i));// 0 1 2
            }
        }
        int firstIndex = 0;
        int secondIndex = 0;
        n = Math.min(a.size(),b.size());
        if (a.size()>b.size()){
            firstIndex=a.get(n);
            secondIndex=a.get(n+1);
        }else{
            firstIndex=b.get(n);
            secondIndex=b.get(n+1);
        }
        Collections.sort(result);
        int max = Math.max(firstIndex,secondIndex);
        int min = Math.min(firstIndex,secondIndex);
        for (Integer i:result) {
            if (i>min&&i<max){
                System.out.print(i+" ");
            }
        }
    }
}
