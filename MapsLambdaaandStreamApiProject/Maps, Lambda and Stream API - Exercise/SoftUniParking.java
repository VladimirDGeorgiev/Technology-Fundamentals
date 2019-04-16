package HashMapsandStream.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> parking = new LinkedHashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] data = scanner.nextLine().split(" ");
            String reg = data[0];
            String userName = data[1];

            if (reg.equalsIgnoreCase("register")) {
                String licensePlateNumber = data[2];
                if (!parking.containsKey(userName)){
                    parking.put(userName,licensePlateNumber);
                    System.out.println(String.format("%s registered %s successfully",userName,licensePlateNumber));
                }else {
                    System.out.println(String.format("ERROR: already registered with plate number %s",licensePlateNumber));
                }
            }else if (reg.equalsIgnoreCase("unregister")){
                if (!parking.containsKey(userName)){
                    System.out.println(String.format("ERROR: user %s not found",userName));
                }else {
                    System.out.println(String.format("%s unregistered successfully",userName));
                    parking.remove(userName);
                }

            }

        }
        parking.entrySet().forEach(e-> System.out.println(String.format("%s => %s",e.getKey(),e.getValue())));
    }
}
