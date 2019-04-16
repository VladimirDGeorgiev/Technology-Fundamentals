package ExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

public class VaporWinterSaleMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s*,\\s+");
        Map<String,Double> gameWithPrice = new LinkedHashMap<>();
        Map<String,String> gameWithDLC = new LinkedHashMap<>();//може би , може да има повече от едно DLC - List<String>

        for (int i = 0; i <input.length ; i++) {
            if (input[i].contains("-")){
                String[] data = input[i].split("-");
                String game = data[0];
                double price = Double.parseDouble(data[1]);
                gameWithPrice.putIfAbsent(game,0.0);
                gameWithPrice.put(game,gameWithPrice.get(game)+price);
            }else if (input[i].contains(":")){
                String[] data = input[i].split(":");
                String game = data[0];
                String dlc = data[1];
                if (gameWithPrice.containsKey(game)){
                    gameWithDLC.putIfAbsent(game,dlc);
                    gameWithPrice.put(game,gameWithPrice.get(game)*1.2);
                }
            }
        }
        gameWithPrice.entrySet().stream().forEach(e->{

            if (!gameWithDLC.containsKey(e.getKey())){
                gameWithPrice.put(e.getKey(),gameWithPrice.get(e.getKey())*0.8);
            }else{
                gameWithPrice.put(e.getKey(),gameWithPrice.get(e.getKey())*0.5);
            }
        });
    gameWithPrice.entrySet().stream().sorted((a,b)->Double.compare(a.getValue(),b.getValue()))
            .forEach(e->{
                if (gameWithDLC.containsKey(e.getKey())){
                    System.out.println(String.format("%s - %s - %.2f",e.getKey(),gameWithDLC.get(e.getKey()),e.getValue()));
                }
            });
        gameWithPrice.entrySet().stream().sorted((a,b)->Double.compare(b.getValue(),a.getValue()))
                .forEach(e->{
                    if (!gameWithDLC.containsKey(e.getKey())){
                        System.out.println(String.format("%s - %.2f",e.getKey(),e.getValue()));
                    }
                });

    }
}
