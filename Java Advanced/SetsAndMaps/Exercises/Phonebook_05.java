package SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> phonebook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")){
            String[] data = input.split("-");
            String name = data[0];
            String phone = data[1];
            phonebook.putIfAbsent(name,phone);
            if (phonebook.containsKey(name)){
                phonebook.put(name,phone);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")){
            if (phonebook.containsKey(input)){
                System.out.println(String.format("%s -> %s",input,phonebook.get(input)));
            }else{
                System.out.println(String.format("Contact %s does not exist.",input));
            }
            input = scanner.nextLine();
        }
    }
}
