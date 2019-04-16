package ExamPreparation;

import java.util.*;
import java.util.regex.Matcher;

public class ConcertMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String,Integer> bandInt = new TreeMap<>();
        Map<String, ArrayList<String>> band = new LinkedHashMap<>();
        while (!command.equalsIgnoreCase("start of concert")){
            String[] data = command.split(";\\s+");
            String addOrPlay = data[0];
            String bandName = data[1];
            if (addOrPlay.equalsIgnoreCase("Add")){
            String[] names = data[2].split(",\\s+");
            band.putIfAbsent(bandName,new ArrayList<>());
                for (int i = 0; i <names.length ; i++) {
                    boolean existing = true;
                    for (var kvp:band.entrySet()) {
                        if (!existing){
                            break;
                        }
                        for (var j:kvp.getValue()) {
                            if (names[i].equals(j)){
                                existing = false;
                                break;
                            }
                        }
                    }
                    if (existing){
                        band.get(bandName).add(names[i]);
                    }
                }

            }else if (addOrPlay.equalsIgnoreCase("Play")){
                int time = Integer.parseInt(data[2]);
                if (!bandInt.containsKey(bandName)){
                    bandInt.put(bandName,0);
                    bandInt.put(bandName,bandInt.get(bandName)+time);
                }else{
                    bandInt.put(bandName,bandInt.get(bandName)+time);
                }
            }
            command = scanner.nextLine();
        }
        String commandBand = scanner.nextLine();
        int totaltime = 0;
        for (var i:bandInt.entrySet()) {
            totaltime+=i.getValue();
        }
        System.out.println(String.format("Total time: %d",totaltime));
        bandInt.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                .forEach(e->{
                    System.out.println(String.format("%s -> %d",e.getKey(),e.getValue()));
                });
        band.entrySet().stream().filter(e->e.getKey().equalsIgnoreCase(commandBand)).forEach(e1->{
            System.out.println(String.format("%s",e1.getKey()));
            e1.getValue().forEach(e2->{
                System.out.println(String.format("=> %s",e2));
            });
        });

    }
}
