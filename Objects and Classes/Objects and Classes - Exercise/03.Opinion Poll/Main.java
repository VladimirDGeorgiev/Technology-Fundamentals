package Objectandclass.OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> input = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String name = command[0];
            int age =Integer.parseInt(command[1]);
         // if (age<30){
         //     continue;
         // }
           input.add(new Person(name,age));

        }
        for (int j = 0;  j<input.size() ; j++) {
            if (input.get(j).getAge()<=30){
                input.remove(j);
                j--;
            }

        }
        input.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(e->{
            System.out.println(e.toString());
        });



    }

}
