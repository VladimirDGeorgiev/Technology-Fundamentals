package HashMapsandStream.Exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, ArrayList<Double>> orders = new LinkedHashMap<>();

        while (!command.equalsIgnoreCase("buy")){
            String[] data = command.split(" ");
            String name = data[0];
            Double price = Double.parseDouble(data[1]);
            Double quantity = Double.parseDouble(data[2]);

            if (!orders.containsKey(name)){
                orders.put(name,new ArrayList<>());
                orders.get(name).add(price);
                orders.get(name).add(quantity);
            }else {
                orders.get(name).set(1,orders.get(name).get(1)+quantity);
                if (!orders.get(name).get(0).equals(price)){
                    orders.get(name).set(0,price);
                }
            }
            command = scanner.nextLine();
        }
        orders.entrySet().stream().
                forEach(e-> System.out.println(String.format
                        ("%s -> %.2f",e.getKey(),e.getValue().get(0)*e.getValue().get(1))));
    }
}
