package JavaOOp.Generics.Exercises.CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        ListCustom<String> list = new ListCustom<>();
        String input = reader.readLine();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Add":
                    list.add(data[1]);
                    break;
                case "Remove":
                    list.remove(Integer.parseInt(data[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(data[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(data[1]),Integer.parseInt(data[2]));
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(data[1]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list.printList().trim());
                    break;
                case "Sort":
                    list.sort();
                    break;

                default:
                    break;
            }


            input = reader.readLine();
        }


    }
}
