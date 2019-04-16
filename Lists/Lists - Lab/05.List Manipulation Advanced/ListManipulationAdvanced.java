package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("end")){
            String[] arrCommand = command.split(" ");

           switch (arrCommand[0]){
               case "contains":
                   int num = Integer.parseInt(arrCommand[1]);
                   if (numList.contains(num)){
                       System.out.println("Yes");
                   }
                   else{
                       System.out.println("No such number");
                   }
                   break;
               case "print": if (arrCommand[1].equals("even")){
                   for (Integer i:numList) {
                       if (i%2==0) System.out.print(i+" ");
                   }
                   System.out.println();
               }else{
                   for (Integer i:numList) {
                       if (i%2==1) System.out.print(i+ " ");
                   }
                   System.out.println();
               }
                   break;
               case "get":
                   int sum = 0;
                   for (Integer i :numList) {
                       sum+=i;
                   }
                   System.out.println(sum);
                   break;
               case "filter":
                   String ravenstvo =  arrCommand[1];
                   Integer number = Integer.parseInt(arrCommand[2]);
                   if (ravenstvo.equals(">")){
                       for (Integer i:numList) {
                           if (i>number) System.out.print(i+" ");
                       }
                       System.out.println();
                   }
                   if (ravenstvo.equals("<")){
                       for (Integer i:numList) {
                           if (i<number) System.out.print(i+" ");
                       }
                       System.out.println();
                   }
                   if (ravenstvo.equals(">=")){
                       for (Integer i:numList) {
                           if (i>=number) System.out.print(i+" ");
                       }
                       System.out.println();
                   }
                   if (ravenstvo.equals("<=")){
                       for (Integer i:numList) {
                           if (i<=number) System.out.print(i+" ");
                       }
                       System.out.println();
                   }
                   if (ravenstvo.equals("==")){
                       for (Integer i:numList) {
                           if (i==number) System.out.print(i+" ");
                       }
                       System.out.println();
                   }

                   break;
               default:
                   return;
           }

            command =scanner.nextLine().toLowerCase();
        }
    }
}
