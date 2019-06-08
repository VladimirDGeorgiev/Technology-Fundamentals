package JavaAdvance.DefiningClasses.Exercises.p01OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(reader.readLine());
        List<Person> list = new ArrayList<>();
        String command;

        while (numberOfLines-->0){
            String[] data = reader.readLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            list.add(new Person(name,age));
        }
        list.stream()
                .filter(e->e.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person ->System.out.println(person.getName()+" - "+person.getAge()));

    }
}
