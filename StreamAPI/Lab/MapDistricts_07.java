package StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class MapDistricts_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");
        LinkedHashMap<String, ArrayList<Integer>> districts = new LinkedHashMap<>();
        for (String e : input) {
            String[] token = e.split(":");
            String city = token[0];
            int population = Integer.parseInt(token[1]);
            districts.putIfAbsent(city,new ArrayList<>());
            districts.get(city).add(population);
        }
        int minPopulation = Integer.parseInt(reader.readLine());
        districts.entrySet().stream()
                .filter(e-> e.getValue().stream().mapToInt(Integer::valueOf).sum()>=minPopulation)
                .sorted((kv1,kv2)->Integer.compare(kv2.getValue().stream().mapToInt(Integer::valueOf).sum(),
                        kv1.getValue().stream().mapToInt(Integer::valueOf).sum()))
                .forEach(e-> {
                    System.out.print(e.getKey()+": ");
                    e.getValue().stream().sorted(Collections.reverseOrder())
                            .limit(5)
                            .forEach(p -> {
                                System.out.print(p+" ");
                            });
                    System.out.println();
                });
    }
}
