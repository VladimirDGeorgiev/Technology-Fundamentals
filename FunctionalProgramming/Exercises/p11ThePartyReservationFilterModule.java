package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p11ThePartyReservationFilterModule {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> names = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        List<String[]> filters = new ArrayList<>();
        String commands = "";
        while (!(commands= reader.readLine()).equals("Print")){
            String[] commandData = commands.split(";");
            String command = commandData[0];
            String filterType = commandData[1];
            String filterParameter = commandData[2];
            if (command.equals("Add filter")){
                filters.add(new String[]{filterType,filterParameter});
            }else if (command.equals("Remove filter")){
                    filters.removeIf(e-> Arrays.equals(e, new String[]{filterType,filterParameter}));
            }
        }
        for (String[] filter : filters) {
            switch (filter[0]){
                case "Starts with":
                    names = names.stream()
                            .filter(e->!e.substring(0, filter[1].length()).equals(filter[1]))
                            .collect(Collectors.toList());
                    break;
                case "Ends with":names = names.stream()
                        .filter(e->!e.substring(e.length()-filter[1].length()).equals(filter[1]))
                        .collect(Collectors.toList());
                    break;
                case "Length":
                    // дали е число
                    names = names.stream()
                            .filter(e->e.length()!=Integer.parseInt(filter[1]))
                            .collect(Collectors.toList());
                    break;
                case "Contains":
                    names = names.stream()
                            .filter(e->!e.contains(filter[1]))
                            .collect(Collectors.toList());
                    break;

                default:
                    break;
            }
        }
        System.out.println(names.toString().replaceAll("[,\\]\\[]",""));
    }
}
