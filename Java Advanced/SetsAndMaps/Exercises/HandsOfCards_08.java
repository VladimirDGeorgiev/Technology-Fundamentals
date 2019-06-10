package SetsAndMaps.Exercises;

import java.lang.reflect.Array;
import java.util.*;

public class HandsOfCards_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, LinkedHashSet<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] data = input.split(": ");
            String name = data[0];
            String[] cards = data[1].split(", ");
            players.putIfAbsent(name, new LinkedHashSet<>());
            players.get(name).addAll(Arrays.asList(cards));

            input = scanner.nextLine();
        }
        LinkedHashMap<String, Integer> resultCards = new LinkedHashMap<>();

        players.forEach((key, value) -> {
            resultCards.put(key, 0);
            value.forEach(c -> {
                String typeCard = String.valueOf(c.charAt(0));
                int valuecard = 0;
                if (c.length()==2) {
                    switch (typeCard) {
                        case "J":
                            valuecard = 11;
                            break;
                        case "Q":
                            valuecard = 12;
                            break;
                        case "K":
                            valuecard = 13;
                            break;
                        case "A":
                            valuecard = 14;
                            break;
                        default:
                                valuecard = Integer.parseInt(String.valueOf(c.charAt(0)));
                            break;
                    }
                }else{
                    valuecard=Integer.parseInt(c.substring(0,2));
                }

                switch (String.valueOf(c.charAt(c.length()-1))) {
                    case "S":
                        resultCards.put(key, resultCards.get(key) + (4 * valuecard));
                        break;
                    case "H":
                        resultCards.put(key, resultCards.get(key) + (3 * valuecard));
                        break;
                    case "D":
                        resultCards.put(key, resultCards.get(key) + (2 * valuecard));
                        break;
                    case "C":
                        resultCards.put(key, resultCards.get(key) + valuecard);
                        break;
                    default:
                        break;
                }
            });
        });
        resultCards.forEach((key, value) -> System.out.println(String.format("%s: %d", key, value)));
    }
}
