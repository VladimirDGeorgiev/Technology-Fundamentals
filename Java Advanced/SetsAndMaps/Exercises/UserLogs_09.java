package SetsAndMaps.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserLogs_09 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LinkedHashMap<String, Integer>> userLog = new TreeMap<>();
        String commands = "";
        while (!"end".equals(commands = reader.readLine())) {
            String[] dataCommands = commands.split("\\s+");
            String[] userData = dataCommands[2].split("=");
            String user = userData[1];
            String[] ipData = dataCommands[0].split("=");
            String ip = ipData[1];
            userLog.putIfAbsent(user,new LinkedHashMap<>());
            userLog.get(user).putIfAbsent(ip,0);
            userLog.get(user).put(ip,userLog.get(user).get(ip)+1);
        }

        userLog.forEach((user, value) -> {
            System.out.println(user + ": ");
            AtomicInteger count = new AtomicInteger(1);
            value.forEach((ip, value1) -> {
                if (value.size()== count.getAndIncrement()){
                    System.out.printf(ip + " => " + value1 + ".%n");
                }else {
                    System.out.print(ip + " => " + value1 + ", ");
                }
            });
        });
    }
}
