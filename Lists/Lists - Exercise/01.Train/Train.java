package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        int vagonMax =Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("end")){
            String[] comArr = command.split("\\s+");
            if (comArr[0].equals("add")){
                numList.add(Integer.parseInt(comArr[1]));
            }
            else{
                int passengers = Integer.parseInt(command);

                for (int i = 0; i <numList.size() ; i++) {
                    if (vagonMax-numList.get(i)>=passengers){
                        numList.set(i,numList.get(i)+passengers);
                        break;
                    }
                }
            }

            command = scanner.nextLine().toLowerCase();
        }
        System.out.println(numList.toString().replaceAll("\\[|,|\\]",""));
    }
}
