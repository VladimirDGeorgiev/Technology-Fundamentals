package PreparetioForMidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("course start")){
            String[] data = command.split("\\:+");
            switch (data[0]){
                case "Add":
                    if (!input.contains(data[1])){
                        input.add(data[1]);
                    }
                    break;
                case "Insert":
                    String lesson = data[1];
                    int index = Integer.parseInt(data[2]);

                    if (index>=0&&index<input.size()&&!input.contains(lesson)){
                        input.add(index,lesson);
                    }
                    break;
                case "Remove":
                    if (input.contains(data[1])){
                        input.remove(data[1]);
                      int indexExec= input.indexOf(data[1]+"-Exercise");
                      if (indexExec!=-1) {
                          input.remove(indexExec);
                      }
                    }
                    break;
                case "Swap":

                    String lessonTitle1 = data[1];
                    String lessonTitle2 = data[2];
                    //Collections.swap(input,input.indexOf(lessonTitle1),input.indexOf(lessonTitle2));

                    int index1 = input.indexOf(lessonTitle1);
                    int index2 = input.indexOf(lessonTitle2);
                    if (index1 != -1 && index2 != -1)
                    {
                        input.set(index1,lessonTitle2);
                        input.set(index2,lessonTitle1);

                        if (index1 + 1 < input.size() && input.get(index1+1)
                                .equalsIgnoreCase( lessonTitle1+"-Exercise"))
                        {
                            input.remove(index1 + 1);
                            index1 = input.indexOf(lessonTitle1);
                            input.set(index1 + 1,lessonTitle1+"-Exercise");
                        }

                        if (index2 + 1 < input.size() && input.get(index2+1)
                                .equalsIgnoreCase(lessonTitle2+"-Exercise"))
                        {
                            input.remove(index2 + 1);
                            index2 = input.indexOf(lessonTitle2);
                            input.set(index2 + 1,lessonTitle2+"-Exercise");
                        }
                    }

                    break;
                case "Exercise":
                    if (input.contains(data[1])&&!input.contains(data[1]+"-Exercise")){
                        input.add(input.indexOf(data[1])+1,data[1]+"-Exercise");
                    }else if (!input.contains(data[1])){
                        input.add(data[1]);
                        input.add(data[1]+"-Exercise");
                    }
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }
        int counter = 1;
        for (String i:input) {
            System.out.println(String.format("%d.%s",counter,i));
            counter++;
        }
    }
}
