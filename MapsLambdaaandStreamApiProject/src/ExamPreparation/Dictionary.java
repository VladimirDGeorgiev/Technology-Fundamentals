package ExamPreparation;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String[] secondString = scanner.nextLine().split(" \\| ");
        String thirdString = scanner.nextLine();
        Map<String, ArrayList<String>> map = new TreeMap<>();
        String[]firstdata = firstString.split(" \\| ");
        for (String firstdatum : firstdata) {
            String[] data = firstdatum.split(": ");
            String word = data[0];
            String definitions = data[1];
            map.putIfAbsent(word, new ArrayList<>());
            map.get(word).add(definitions);
        }
        for (String keyWords : secondString) {
            if (map.containsKey(keyWords)){
                map.entrySet().stream().filter(e->e.getKey().equals(keyWords)).
                        forEach(j->{
                            System.out.println(String.format("%s",j.getKey()));
                            map.get(j.getKey()).stream().sorted((a,b)->Integer.compare(b.length(),a.length())).
                                    forEach(list->{
                                        System.out.println(String.format(" -%s",list));
                                    });

                        });
            }
        }
        if (thirdString.equalsIgnoreCase("List")){
            map.forEach((key,value)->{
                System.out.printf("%s ",key);
            });
        }
    }
}
