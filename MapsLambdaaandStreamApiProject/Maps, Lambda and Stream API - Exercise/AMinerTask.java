package HashMapsandStream.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String,Long> data = new LinkedHashMap<>();

        while (!command.equalsIgnoreCase("stop")){
            long value = Integer.parseInt(scanner.nextLine());
            data.putIfAbsent(command,(long)0);
            data.put(command,data.get(command)+value);
            command = scanner.nextLine();
        }
        for (Map.Entry<String,Long> i:data.entrySet()
             ) {
            System.out.println(String.format("%s -> %d",i.getKey(),i.getValue()));
        }
    }
}
