package PreparetioForMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("[&+]")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!"Finished!".equals(command)){
            String[] data = command.split("\\s+");
            switch (data[0]){
                case "Bad":
                    if (input.contains(data[1])){
                        break;
                    }else{
                        input.add(0,data[1]);
                    }
                    break;
                case "Good":
                    input.remove(data[1]);
                    break;
                case "Rename":
                    if (input.contains(data[1])){
                        input.set(input.indexOf(data[1]),data[2]);
                    }
                    break;
                case "Rearrange":
                    if (input.contains(data[1])){
                        input.remove(data[1]);
                        input.add(data[1]);
                    }
                    break;
                default:
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println(input.toString().replaceAll("[\\[\\]]",""));
    }
}
