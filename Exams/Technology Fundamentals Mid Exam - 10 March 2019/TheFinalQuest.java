package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheFinalQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("stop")){
            String[] data = command.split("\\s+");

            switch (data[0].toLowerCase()){
                case "delete":
                    int index = Integer.parseInt(data[1])+1;  // +1 защото махаме следващата дума , валидираме него индекс
                    if (index>=0&&index<input.size()){
                        input.remove(index);
                    }
                    break;
                case "swap":
                    String word1 = data[1];
                    String word2 = data[2];
                    int index1 =  input.indexOf(word1);
                    int index2 =  input.indexOf(word2);
                    if (index1!=-1&&index2!=-1){
                        String temp = input.get(index1);
                        input.set(index1,input.get(index2));
                        input.set(index2,temp);
                    }
                    break;
                case "put":

                    int index11 = Integer.parseInt(data[2])-1; // сверяваме с предния индекс затова е -1 !!!!!
                    if (index11>=0&&index11<=input.size()){
                        input.add(index11,data[1]);
                    }
                    break;
                case "sort":
                    input.sort(Collections.reverseOrder());
                    break;
                case "replace":
                    int index22 = input.indexOf(data[2]);
                    if (index22!=-1){
                        input.set(index22,data[1]);
                    }
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(input.toString().replaceAll("[\\[\\],]",""));
    }
}
