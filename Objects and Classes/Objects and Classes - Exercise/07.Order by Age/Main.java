package Objectandclass.OrderbyAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command =scanner.nextLine();
        List<Person> result =  new ArrayList<>();
        while (!"End".equals(command)){
            String[] inputData = command.split("\\s+");
            result.add(new Person(inputData[0],inputData[1],Integer.parseInt(inputData[2])));
            command = scanner.nextLine();
        }
        result.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(person -> System.out.println(person.toString()));
    }
}
