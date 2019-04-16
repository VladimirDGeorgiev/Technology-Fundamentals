package ListExer;

import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
       String[] data = scanner.nextLine().split("\\s+");

       while(listArr.contains(data[0])){
           int bombIndex = listArr.indexOf(data[0]);/// не намирам индекса на числото !!!!
           int power = Integer.parseInt(data[1]);
           int startIndex = 0;
           int endIndex = listArr.size()-1;
           if (bombIndex-power>=0){
               startIndex=bombIndex-power;
           }
           if (bombIndex+power<=listArr.size()-1){
               endIndex=bombIndex+power;
           }
           int sum = endIndex-startIndex;
           for (int i = startIndex; i <=endIndex ; i++) {
               listArr.remove(startIndex);
           }
       }
       int sum = 0;
        for (String i :listArr) {

            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);



    }
}
