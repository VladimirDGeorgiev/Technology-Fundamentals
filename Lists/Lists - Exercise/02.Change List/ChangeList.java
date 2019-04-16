package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("end")){
            String[] arr = command.split("\\s+");
            if (arr[0].equals("delete")){
                for (int i = 0; i <numList.size() ; i++) {
                    if (Integer.parseInt(arr[1])==numList.get(i)) {
                        numList.remove(i);
                        i-=1;
                    }
                }
            }
            if (arr[0].equals("insert")){
                if (Integer.parseInt(arr[2])>=0&&Integer.parseInt(arr[2])<numList.size()){
                    numList.add(Integer.parseInt(arr[2]), Integer.parseInt(arr[1]));
                }
            }
            command = scanner.nextLine().toLowerCase();
        }
        System.out.println(numList.toString().replaceAll("\\[|,|\\]",""));

    }
}
