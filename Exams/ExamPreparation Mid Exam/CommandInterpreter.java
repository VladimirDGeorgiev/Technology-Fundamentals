package PreparetioForMidExam;

import java.util.*;
import java.util.stream.Collectors;

public class CommandInterpreter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String > input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("end")){
            String[] data = command.split("\\s+");

            switch (data[0].toLowerCase()){
                case "reverse":
                    int start = Integer.parseInt(data[2]);
                    int count = Integer.parseInt(data[4]);
                    boolean validation= validationIndex(input,start,count);
                    if (validation){
                        List<String> temp = new ArrayList<>();
                        for (int i = start; i <start+count ; i++) {
                            temp.add(input.get(i));
                        }
                        Collections.reverse(temp);
                        int counttemp = 0;
                        for (int i = start; i <start+count ; i++) {
                            input.set(i,temp.get(counttemp));
                            counttemp++;
                        }
                    }
                    break;
                case "sort":
                    int start1 = Integer.parseInt(data[2]);
                    int  count1 = Integer.parseInt(data[4]);
                     validation= validationIndex(input,start1,count1);
                    if (validation){
                        List<String> temp1 = new ArrayList<>();
                        for (int i = start1; i <start1+count1 ; i++) {
                            temp1.add(input.get(i));
                        }
                        Collections.sort(temp1);
                        int counttemp = 0;
                        for (int i = start1; i <start1+count1 ; i++) {
                            input.set(i,temp1.get(counttemp));
                            counttemp++;
                        }
                    }
                    break;
                case "rollleft":
                    count=Integer.parseInt(data[1]);
                    if (count>=0) {
                        count = count % input.size();
                        Collections.rotate(input, input.size() - count);
                    }else{
                        System.out.println("Invalid input parameters.");
                    }
                    break;
                case "rollright":
                    count=Integer.parseInt(data[1]);
                    if (count>=0) {
                        count = count % input.size();
                        Collections.rotate(input, count);
                    }else{
                        System.out.println("Invalid input parameters.");
                    }
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(input.toString());
    }

    private static boolean validationIndex(List<String> input, int start, int count) {
        if ((start>=0&&start<input.size())&&count>=0&&start+count<=input.size()){
            return true;
        }else {
            System.out.println("Invalid input parameters.");
            return false;
        }
    }
}
