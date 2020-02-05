package SetsAndMaps.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class PopulationCounter_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LinkedHashMap<String,Long>> populationData = new LinkedHashMap<>();
        Map<String,Long> countryPopulation = new LinkedHashMap<>();
        String commands = "";
        while (!"report".equals(commands= reader.readLine())){
            String[] commandsData = commands.split("\\|+"); // може повече от един
            String city = commandsData[0];
            String country  = commandsData[1];
            long population  =Long.parseLong(commandsData[2]);
            populationData.putIfAbsent(country,new LinkedHashMap<>());
            populationData.get(country).putIfAbsent(city,population);
            countryPopulation.putIfAbsent(country,(long)0);
            countryPopulation.put(country,countryPopulation.get(country)+population);
        }
        countryPopulation.entrySet().stream()
                .sorted((a,b)->Long.compare(b.getValue(),a.getValue()))
                .forEach(e->{
                    System.out.println(String.format("%s (total population: %d)",e.getKey(),e.getValue()));
                    populationData.get(e.getKey()).entrySet().stream()
                            .sorted((p1,p2)->Long.compare(p2.getValue(),p1.getValue()))
                            .forEach(e1->{
                        System.out.println(String.format("=>%s: %d",e1.getKey(),e1.getValue()));
                    });
                });
    }

}
