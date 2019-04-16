package ExamPreparation;

import com.sun.source.tree.IfTree;

import java.util.*;

public class IronGirder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input   = scanner.nextLine();
        Map<String,Integer> mapCityTime = new TreeMap<>();
        Map<String,Integer> mapCityPassengers = new LinkedHashMap<>();

        while (!input.equalsIgnoreCase("Slide rule")){
            if (input.contains("ambush")){
                String[] data1 = input.split(":");
                String[] data2 = data1[1].split("->");
                String city = data1[0];
                int passengers=Integer.parseInt(data2[1]);
                if (mapCityTime.containsKey(city)){
                    mapCityTime.put(city,0);
                    mapCityPassengers.put(city,mapCityPassengers.get(city)-passengers);
                }

            }else{
                String[] data3 = input.split(":");
                String[] data4 = data3[1].split("->");
                String city1 = data3[0];
                int time1=Integer.parseInt(data4[0]);
                int passengers1=Integer.parseInt(data4[1]);
                mapCityTime.putIfAbsent(city1,time1);
                if (mapCityTime.get(city1)>time1||mapCityTime.get(city1)==0){
                    mapCityTime.put(city1,time1);
                }
                mapCityPassengers.putIfAbsent(city1,0);
                mapCityPassengers.put(city1,mapCityPassengers.get(city1)+passengers1);
            }
            input   = scanner.nextLine();
        }
        mapCityTime.entrySet().stream().filter(c->c.getValue()>0).sorted(Comparator.comparingInt(Map.Entry::getValue))
                .forEach(e->{
                    if (mapCityPassengers.get(e.getKey())>=0) {
                        System.out.println(String.format("%s -> Time: %d -> Passengers: %d"
                                , e.getKey(), e.getValue(), mapCityPassengers.get(e.getKey())));
                    }
                });
    }
}
