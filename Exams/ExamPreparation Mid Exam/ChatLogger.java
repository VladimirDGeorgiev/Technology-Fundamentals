package PreparetioForMidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>();
        String command = scanner.nextLine();

        while (!"end".equalsIgnoreCase(command)){
            String[] input = command.split("\\s+");
            switch (input[0]){
                case "Chat":
                    data.add(input[1]);                     // може да са повече от 1 думите
                    break;
                case "Delete":
                    data.remove(input[1]);
                    break;
                case "Edit":
                    if (data.contains(input[1])){
                    data.set(data.indexOf(input[1]),input[2]);}
                    break;
                case "Pin":
                    if (data.contains(input[1])){
                        data.remove(input[1]);
                        data.add(input[1]);
                    }
                    break;
                case "Spam":
                    for (int i = 1; i <input.length ; i++) {
                        data.add(input[i]);
                    }
                    break;
                default:
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.println(data.toString().replaceAll("[\\[,\\]]","")
                .replaceAll("\\s+","\n"));
    }
}
