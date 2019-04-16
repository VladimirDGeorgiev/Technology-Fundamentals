package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("end")) {
            if (command.contains("add")) {
                int number = getNumber(command);
                numList.add(number);

            }
            if (command.contains("remove")) {
                int number = getNumber(command);
                numList.remove(Integer.valueOf(number));
            }
            if (command.contains("removeat")) {
                int number = getNumber(command);
                numList.remove(number);
            }

            if (command.contains("insert")) {
                List<String> getNumber = Arrays.stream(command.split(" ")).collect(Collectors.toList());
                int number = Integer.parseInt(getNumber.get(1));
                int index = Integer.parseInt(getNumber.get(2));
                numList.add(index,number);
            }


            command = scanner.nextLine().toLowerCase();
        }
        System.out.println(numList.toString().replaceAll("\\]|,|\\[", ""));
    }

    static Integer getNumber(String command) {
        List<String> getNumber = Arrays.stream(command.split(" ")).collect(Collectors.toList());
        int number = 0;
        return number = Integer.parseInt(getNumber.get(1));
    }
}
