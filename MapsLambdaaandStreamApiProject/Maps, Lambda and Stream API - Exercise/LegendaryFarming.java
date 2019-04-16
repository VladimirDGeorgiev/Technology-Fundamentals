package HashMapsandStream.Exercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> data = new TreeMap<>();
        Map<String,Integer> junks = new TreeMap<>();
        data.put("shards",0);
        data.put("fragments",0);
        data.put("motes",0);
        while (true){
            int number = Integer.parseInt(scanner.next());
            String item = scanner.next().toLowerCase();
            boolean breakingloop = false;
            String kayWord = "";
            if (item.equals("shards")||item.equals("fragments")||item.equals("motes")){
                data.put(item,data.get(item)+number);
                for (var i:data.entrySet()
                     ) {
                   if(i.getValue()>=250){
                       if (i.getKey().equals("shards")){
                           System.out.println("Shadowmourne obtained!");
                       }else if (i.getKey().equals("fragments")){
                           System.out.println("Valanyr obtained!");
                       }else if (i.getKey().equals("motes")){
                           System.out.println("Dragonwrath obtained!");
                       }
                       kayWord = i.getKey();
                       breakingloop=true;
                      break;
                   }

                }
            }else{
                junks.putIfAbsent(item,0);
                junks.put(item,junks.get(item)+number);
            }
            if (breakingloop){
                data.put(kayWord,data.get(kayWord)-250);
                break;
            }
        }

          data.entrySet().stream()
                  .sorted(((n1, n2) -> Integer.compare(n2.getValue(),n1.getValue())))
                  .forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));
        for (var i :junks.entrySet()
             ) {
            System.out.println(i.getKey()+": "+i.getValue());
        }
    }
}
