package SetsAndMaps.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyrvianUnleashed_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String regex = "(?<name>^[A-Za-z]+[ ]?[A-Za-z]+[ ]?[A-Za-z]+) @(?<city>[A-Za-z]+[ ]?[A-Za-z]+[ ]?[A-Za-z]+) (?<price>\\d+) (?<count>\\d+)$";
        Map<String, LinkedHashMap<String,Long>> playList = new LinkedHashMap<>();
        String command = "";

        while (!"End".equals(command = reader.readLine())) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            if (matcher.find()) {
                String name = matcher.group("name");
                String city = matcher.group("city");
                long money = Long.parseLong(matcher.group("price"))*Long.parseLong(matcher.group("count"));
                playList.putIfAbsent(city,new LinkedHashMap<>());
                playList.get(city).putIfAbsent(name,(long)0);
                playList.get(city).put(name,playList.get(city).get(name)+money);
            }
        }

        playList.forEach((key,value)->{
            System.out.println(key);
            value.entrySet().stream()
                    .sorted((a,b)->Long.compare(b.getValue(),a.getValue()))
                    .forEach(e->{
                        System.out.println(String.format("#  %s -> %d",e.getKey(),e.getValue()));
                    });
        });



    }
}
