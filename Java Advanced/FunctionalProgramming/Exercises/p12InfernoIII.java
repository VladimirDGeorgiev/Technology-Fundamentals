package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p12InfernoIII {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Function<T,R> //accepts a parameter of type T and returns variable of type R //
        //.apply()
        //Consumer<T> is a void interface:
        //.apply()
        //Supplier<T> takes no parameters,but returns  variable
        //.get()
        //Predicate<T> evaluates a boolean condition
        //.test()

        //BiFunction <T, U, R>;BiConsumer <T, U>;BiPredicate <T, U>
        //examp BiFunction <Integer, Integer, String> sum = (x, y) -> "Sum is" + (x + y);
        List<Integer> gems = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String[]> filters = new ArrayList<>();
        String commands = "";
        while (!(commands = reader.readLine()).equals("Forge")) {
            String[] commandData = commands.split(";");
            String command = commandData[0];
            String filterType = commandData[1];
            String filterParameter = commandData[2];
            if (command.equals("Exclude")) {
                filters.add(new String[]{filterType, filterParameter});
            } else if (command.equals("Reverse")) {
                filters.removeIf(e -> Arrays.equals(e, new String[]{filterType, filterParameter}));
            }
        }
        for (String[] filter : filters) {
            int parametar = Integer.parseInt(filter[1]);
            switch (filter[0]) {
                case "Sum Left":
                    for (int i = gems.size()-1; i >=0; i--) {
                        if (i==0 &&parametar==gems.get(i)){
                            gems.remove(i);
                        }else if (i!=0 &&gems.get(i)+gems.get(i-1)==parametar) {
                            gems.remove(i);
                        }
                    }
                    break;
                case "Sum Right":
                    for (int i = gems.size()-1; i >=0; i--) {
                        if (i==gems.size()-1 &&parametar==gems.get(i)){
                            gems.remove(i);
                        }else if (i!=gems.size()-1 &&gems.get(i)+gems.get(i+1)==parametar) {
                            gems.remove(i);
                        }
                    }

                    break;
                case "Sum Left Right":
                    for (int i = gems.size()-1; i >=0; i--) {
                        if (i==0 &&parametar==gems.get(i)+gems.get(i+1)){
                            gems.remove(i);
                        }else if (i==gems.size()-1 &&parametar==gems.get(i)+gems.get(i-1)){
                            gems.remove(i);
                        }else if (i!=gems.size()-1&&i!=0&&gems.get(i)+gems.get(i+1)+gems.get(i-1)==parametar) {
                            gems.remove(i);
                        }
                    }

                    break;
                default:
                    break;
            }
        }
        System.out.println(gems.toString().replaceAll("[,\\]\\[]", ""));
    }
}
