package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     List<String> inputList = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
     String command = scanner.nextLine();
     while (!command.equals("course start")){
         String[] arrCmd = command.split(":");
         switch (arrCmd[0].toLowerCase()){
             case "add":
                 if (!inputList.contains(arrCmd[1])){
                     inputList.add(arrCmd[1]);
                 }
                 break;
             case "insert":
                 if (!inputList.contains(arrCmd[1])){
                     if (Integer.parseInt(arrCmd[2])>=0&&Integer.parseInt(arrCmd[2])<=inputList.size()) {
                         inputList.add(Integer.parseInt(arrCmd[2]), arrCmd[1]);
                     }
                 }
                 break;
             case "remove":
                 if (inputList.contains(arrCmd[1])){
                     int index = inputList.indexOf(arrCmd[1]);
                     if (inputList.get(index+1).equals(arrCmd[1]+"-Exercise")){
                         inputList.remove(index);
                         inputList.remove(index);
                     }else{
                         inputList.remove(arrCmd[1]);
                     }

                 }
                 break;
             case "swap":
                 if (inputList.contains(arrCmd[1])&&inputList.contains(arrCmd[2])){
                     String temp1 = arrCmd[1];
                     int index1 = inputList.indexOf(arrCmd[1]);
                     int index2 = inputList.indexOf(arrCmd[2]);
                     inputList.set(index1,inputList.get(index2));
                     inputList.set(index2,temp1);
                     if(inputList.contains(arrCmd[2]+"-Exercise")){
                         int index = inputList.indexOf(arrCmd[2]+"-Exercise");
                         inputList.add(index1+1,arrCmd[2]+"-Exercise");
                         inputList.remove(index+1);
                     }
                     if (inputList.contains(arrCmd[1]+"-Exercise")){
                         int index = inputList.indexOf(arrCmd[1]+"-Exercise");
                         inputList.add(index2+1,arrCmd[1]+"-Exercise");
                         inputList.remove(index+1);
                     }


                 }
                 break;
             case "exercise":
                 if (!inputList.contains(arrCmd[1])){
                     inputList.add(arrCmd[1]);
                     inputList.add(arrCmd[1]+"-Exercise");
                 }
                 else if (inputList.contains(arrCmd[1])&&!(inputList.contains(arrCmd[1]+"-Exercise"))){
                     int index = inputList.indexOf(arrCmd[1]);
                     inputList.add(index+1,arrCmd[1]+"-Exercise");
                 }
                 break;
             default:
                 break;
         }





         command = scanner.nextLine();

     int count=1;
     for (String i:inputList) {
         System.out.println(count+ "" +i);
         count++;
     }
    }
}}
