package TextProcessingandRegularExpressions.Exers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Race10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        Map<String,Integer> resultList = new LinkedHashMap<>();
        for (String i:data) {
            resultList.putIfAbsent(i,0);
        }
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end of race")){
            int sum = 0;
            StringBuilder name = new StringBuilder();
            for (int i = 0; i <command.length() ; i++) {
                if (Character.isDigit(command.charAt(i))){
                    sum+=Integer.parseInt(String.valueOf(command.charAt(i)));
                }else if(Character.isAlphabetic(command.charAt(i))){
                    name.append(command.charAt(i));
                }
            }
            if (resultList.containsKey(name.toString())){
                resultList.put(name.toString(),resultList.get(name.toString())+sum);
            }
            command = scanner.nextLine();
        }
        int[] count = {1};
        resultList.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                .limit(3)
                .forEach(e->{
                    if (count[0]==1) {
                        System.out.println(String.format("1st place: %s", e.getKey()));
                        count[0]++;
                    }else if (count[0]==2){
                        System.out.println(String.format("2nd place: %s", e.getKey()));
                        count[0]++;
                    } else if (count[0]==3){
                        System.out.println(String.format("3rd place: %s", e.getKey()));
                        count[0]++;
                    }
                });
    }
}
