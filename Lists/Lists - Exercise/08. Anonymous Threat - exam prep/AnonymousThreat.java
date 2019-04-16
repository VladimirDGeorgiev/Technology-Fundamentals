package ListExer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       List<String> inputData = Arrays.stream(scanner.nextLine().split("\\s+"))
               .collect(Collectors.toList());
       String command = scanner.nextLine().toLowerCase();

       while (!(command.equals("3:1"))){
           String[] arrCmd =command.split("\\s+");
           command = arrCmd[0];
           if (command.equals("merge")){
               int startIndex = Integer.parseInt(arrCmd[1]);
               int endIndex = Integer.parseInt(arrCmd[2]);
               if (startIndex<0){
                   startIndex=0;
               }
               if (endIndex>=inputData.size()){
                   endIndex=inputData.size()-1;
               }
               for (int i = startIndex; i <endIndex ; i++) {
                   inputData.set(startIndex,inputData.get(startIndex)+inputData.get(startIndex+1));
                   inputData.remove(startIndex+1);
               }
           }
           if (command.equals("divide")){
               int index = Integer.parseInt(arrCmd[1]);
               int divide = Integer.parseInt(arrCmd[2]);



               List<String> tempArrList = new ArrayList<>();
               String word = inputData.get(index);
               inputData.remove(index);
               int parts = word.length() / divide;
               int procentnoDeleno = word.length()%divide;
               int count =divide;
               for (int i = 0; i <divide ; i++)        // pri asdasdd и divide 4 има грешка, трябва да се оправи случая при който word.lenght()/divide!=0
               {

                   if (count==procentnoDeleno){
                       parts++;
                   }
                   tempArrList.add(word.substring(i*parts,i*parts+1));
                   count--;
                  //if (i== divide -1)
                  //{
                  //    tempArrList.add(word.substring(i * parts)+" ");
                  //}
                  //else
                  //{
                  //    tempArrList.add(word.substring(i *  parts,count++*parts));

                  //}
                   // string element = word.Substring(0, parts);
                   // word = word.Substring(parts);
                   // divided.Add(element);
               }

               for (String i : tempArrList) {
                   inputData.add(index, i);
                   index++;
               }





           }


           command = scanner.nextLine().toLowerCase();
       }
       System.out.println(inputData.toString().replaceAll("\\[|,|\\]",""));
    }

}
