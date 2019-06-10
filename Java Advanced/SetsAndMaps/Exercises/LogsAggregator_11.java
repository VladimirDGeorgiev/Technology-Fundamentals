package SetsAndMaps.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String,Integer> usersAndLogs = new TreeMap<>();
        Map<String , TreeSet<String>> usersAndIP = new TreeMap<>();
        for (int i = 0; i <n ; i++) {
            String[] inputlogs = reader.readLine().split("\\s+");
            String ip = inputlogs[0];
            String name = inputlogs[1];
            int duration = Integer.parseInt(inputlogs[2]);
            usersAndLogs.putIfAbsent(name,0);
            usersAndLogs.put(name,usersAndLogs.get(name)+duration);
            usersAndIP.putIfAbsent(name,new TreeSet<>());
            usersAndIP.get(name).add(ip);
        }

        usersAndLogs.forEach((user,logs)->{
            System.out.print(String.format("%s: %d ",user,logs));
            System.out.print(usersAndIP.get(user).toString());
            System.out.println();
        });
    }
}
