package PreparetioForMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestsJournal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!"Retire!".equals(commands)){
            String[] data = commands.split(" - ");

            switch (data[0].toLowerCase()){
                case "start":
                    String quest = data[1];
                    boolean exist = true;
                    for (String i:input) {
                        if (i.equals(quest)){
                            exist=false;
                        }
                    }
                    if (exist){
                        input.add(quest);
                    }
                    break;
                case "complete":
                     quest = data[1];
                     input.remove(quest);
                    break;
                case "side quest":
                     String[] questAndSideQuest = data[1].split(":");
                     quest=questAndSideQuest[0];
                     String sideQuest = questAndSideQuest[1];
                     exist = false;
                     int index = -1;
                    for (int i = 0; i <input.size() ; i++) {
                        if (input.get(i).equals(quest)){
                            index = i;
                            exist = true;
                            if (input.contains(sideQuest)){
                                exist = false;
                            }

                        }
                    }
                    if (exist){
                        input.add(index+1,sideQuest);
                    }

                    break;
                case "renew":
                     quest = data[1];
                     exist = false;
                    for (String i:input) {
                        if (i.equals(quest)){
                            exist=true;
                        }
                    }
                    if (exist){
                        input.remove(quest);
                        input.add(quest);
                    }
                    break;

                default:
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println(input.toString().replaceAll("[\\[\\]]",""));
    }
}
