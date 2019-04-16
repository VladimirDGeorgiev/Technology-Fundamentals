package PreparetioForMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GrainsofSand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = scanner.nextLine();
        while (!commands.equalsIgnoreCase("Mort")){
            String[]data = commands.split("\\s+");

            switch (data[0]){
                case "Add":
                    input.add(Integer.parseInt(data[1]));
                    break;
                case "Remove":
                    int num = Integer.parseInt(data[1]);
                    if (input.contains(num)){
                        input.remove((Object)num);
                    }else if(num>=0&&num<input.size()){
                        input.remove(num);
                    }
                    break;
                case "Replace":
                    int value = Integer.parseInt(data[1]);
                    int replacemande = Integer.parseInt(data[2]);
                    for (int i = 0; i <input.size() ; i++) {
                        if (input.get(i)==value){
                            input.set(i,replacemande);
                            break;
                        }
                    }
                    break;
                case "Increase":
                    value = Integer.parseInt(data[1]);
                    int newValue = 0;
                    boolean test = false;
                    for (int i = 0; i <input.size() ; i++) {
                        if (input.get(i)>=value){
                            newValue = input.get(i);
                            test = true;
                            break;
                        }
                    }
                    if (test){
                        for (int i = 0; i <input.size() ; i++) {
                            input.set(i,input.get(i)+newValue);
                        }
                    }else{
                        int temp = input.get(input.size()-1);
                        for (int i = 0; i <input.size() ; i++) {
                            input.set(i,temp+input.get(i));
                        }
                    }
                    break;
                case "Collapse":
                    for (int i = 0; i <input.size() ; i++) {
                        if (input.get(i)<Integer.parseInt(data[1])){
                            input.remove(i);
                            i--;
                        }
                    }
                    break;
                default:
                    break;
            }
            commands = scanner.nextLine();
        }

        System.out.println(input.toString().replaceAll("[\\[\\],]",""));
    }
}
