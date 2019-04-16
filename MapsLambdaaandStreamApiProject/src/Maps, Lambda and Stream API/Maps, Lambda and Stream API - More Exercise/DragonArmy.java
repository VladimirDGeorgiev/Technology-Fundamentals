package HashMapsandStream.Exercise.moreExer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, TreeMap<String,Integer[]>> mapResult = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String[]data = scanner.nextLine().split("\\s+");
            String type = data[0];
            String name = data[1];
            String damage = data[2];
            String health = data[3];
            String armor = data[4];
            mapResult.putIfAbsent(type,new TreeMap<>());
            mapResult.get(type).putIfAbsent(name,new Integer[]{45,250,10});//може и без дефаутни стойности

            if (!damage.equalsIgnoreCase("null")){
                int tempdamage = Integer.parseInt(damage);
                mapResult.get(type).get(name)[0]=tempdamage;
            }else{                                                        //дали се връща дефаутна стойност при null
                mapResult.get(type).get(name)[0]=45;
            }
            if (!health.equalsIgnoreCase("null")){
                mapResult.get(type).get(name)[1]=Integer.parseInt(health);
            }else{
                mapResult.get(type).get(name)[1]=250;
            }
            if (!armor.equalsIgnoreCase("null")){
                mapResult.get(type).get(name)[2]=Integer.parseInt(armor);
            }else{
                mapResult.get(type).get(name)[2]=10;
            }
        }

        Map<String,Double[]> averige = new LinkedHashMap<>();
        for (Map.Entry<String, TreeMap<String, Integer[]>> i : mapResult.entrySet()) {
            averige.putIfAbsent(i.getKey(),new Double[]{0.0,0.0,0.0});
            int countNumberOfDragons = 0;
            for (var s : i.getValue().entrySet()) {
                averige.get(i.getKey())[0]+=s.getValue()[0]*1.0;
                averige.get(i.getKey())[1]+=s.getValue()[1]*1.0;
                averige.get(i.getKey())[2]+=s.getValue()[2]*1.0;
                countNumberOfDragons++;
            }
            averige.get(i.getKey())[0]/=countNumberOfDragons;
            averige.get(i.getKey())[1]/=countNumberOfDragons;
            averige.get(i.getKey())[2]/=countNumberOfDragons;
        }
        System.out.println();
        mapResult.entrySet().stream().forEach(e->{

            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)",
                    e.getKey(),
                    averige.get(e.getKey())[0],
                    averige.get(e.getKey())[1],
                    averige.get(e.getKey())[2]));
            e.getValue().forEach((kay,value)->{
                System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d",
                        kay,
                        value[0],
                        value[1],
                        value[2]
                ));
            });
        });
    }
}
