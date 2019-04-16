package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> dictansice = Arrays.stream(scanner.nextLine().
                split("\\s+")).map(Integer::parseInt).
                collect(Collectors.toList());
        long sum = 0;
        while (!dictansice.isEmpty()){
            int index = Integer.parseInt(scanner.nextLine());
            if (index<0){
               sum+= dictansice.get(0);

               int  tempSmaller =dictansice.get(0);
               listCalculations(dictansice,tempSmaller);
                if (!dictansice.isEmpty()){
                    continue;
                }
                dictansice.remove(0);
                dictansice.set(0,dictansice.get(dictansice.size()-1));
                continue;
            }
            else if (index>=dictansice.size()){
                sum+=dictansice.get(dictansice.size()-1);
                int tempBigger = dictansice.get(dictansice.size()-1);
                listCalculations(dictansice,tempBigger);
                if (!dictansice.isEmpty()){
                    continue;
                }
                dictansice.remove(dictansice.size()-1);
                dictansice.add(dictansice.get(0));
                continue;
            }

            int temp = dictansice.get(index);
            sum+=dictansice.remove(index);

            listCalculations(dictansice, temp);
        }
        System.out.println(sum);
    }

    public static void listCalculations(List<Integer> dictansice, int temp) {
        for (int i = 0; i <dictansice.size() ; i++) {
            if (dictansice.get(i)<=temp){
                dictansice.set(i,dictansice.get(i)+temp);

            }else{
                dictansice.set(i,dictansice.get(i)-temp);
            }

        }
    }
}
