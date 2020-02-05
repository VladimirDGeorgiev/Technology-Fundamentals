package JavaAdvance.DefiningClasses.Exercises.p07Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> personMap = new LinkedHashMap<>();

        String command = "";
        while (!"End".equals(command = reader.readLine())) {
            String[] data = command.split("\\s+");
            String name = data[0];
            personMap.putIfAbsent(name, new Person(name));
            switch (data[1].toLowerCase()) {
                case "company":
                    personMap.get(name).setCompany(new Company(data[2],data[3], Double.parseDouble(data[4])));
                    break;
                case "pokemon":
                    personMap.get(name).setPokemon(new Pokemon(data[2], data[3]));
                    break;
                case "parents":
                    personMap.get(name).setParents(new Parents(data[2], data[3]));
                    break;
                case "children":
                    personMap.get(name).setChildren(new Children(data[2], data[3]));
                    break;
                case "car":
                    personMap.get(name).setCar(new Car(data[2], Integer.parseInt(data[3])));
                    break;
                default:
                    break;
            }
        }
        String name = reader.readLine();
        if (personMap.containsKey(name)) {
            personMap.get(name).print();
        }
    }
}
