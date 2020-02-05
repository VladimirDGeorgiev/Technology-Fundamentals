package SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();

        Map<String,Integer> miner = new LinkedHashMap<>();
        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            miner.putIfAbsent(resource,0);
            miner.put(resource,miner.get(resource)+quantity);

            resource = scanner.nextLine();

        }
        miner.forEach((key,value)->{
            System.out.println(String.format("%s -> %d",key,value));
        });
    }
}
