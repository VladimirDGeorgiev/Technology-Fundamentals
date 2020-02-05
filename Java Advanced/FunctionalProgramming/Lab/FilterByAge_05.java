package FunctionalProgramming.Lab;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> data = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            data.putIfAbsent(input[0],Integer.parseInt(input[1]));
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        Predicate<String> isYounger = s->s.equals("younger");
        if (isYounger.test(condition)){
            data.entrySet().stream()
                    .filter(e->e.getValue()<age)
                    .forEach(e->{if (format.equals("name")){
                        System.out.println(e.getKey());
                    }else if(format.equals("age")){
                        System.out.println(e.getValue());
                    }else{
                        System.out.println(e.getKey()+" - "+e.getValue());
                    }

                    });
        }else {
            data.entrySet().stream()
                    .filter(e->e.getValue()>=age)
                    .forEach(e->{if (format.equals("name")){
                System.out.println(e.getKey());
            }else if(format.equals("age")){
                System.out.println(e.getValue());
            }else{
                System.out.println(e.getKey()+" - "+e.getValue());
            }

            });
        }
    }
}
