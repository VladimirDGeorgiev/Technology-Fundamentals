package FunctionalProgramming.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p10PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
        String commands = "";
        BiPredicate<String,String> isItstartingWith = (word1,word2) -> word1.substring(0, word2.length()).equals(word2);
        BiPredicate<String,String> isItEndsWith = (word1,word2) -> word1.substring(word1.length()-word2.length()).equals(word2);
        BiPredicate<String,Integer> isItTheSameLength = (word1,length) -> word1.length()==length;

        List<String> temp = new ArrayList<>();
        while (!(commands = reader.readLine()).equals("Party!")) {
            String[] commandsData = commands.split("\\s+");
            switch (commandsData[0]) {
                case "Remove":
                    if (commandsData[1].equalsIgnoreCase("StartsWith")) {
                        for (int i = names.size()-1 ;i >=0 ; i--) {
                            if (isItstartingWith.test(names.get(i),commandsData[2])){
                                names.remove(i);
                            }
                        }

                    }else if (commandsData[1].equalsIgnoreCase("EndsWith")){
                        for (int i = names.size()-1 ;i >=0 ; i--) {
                            if (isItEndsWith.test(names.get(i),commandsData[2])){
                                names.remove(i);
                            }
                        }

                    }else if (commandsData[1].equalsIgnoreCase("Length")){
                        for (int i = names.size()-1 ;i >=0 ; i--) {
                            if (isItTheSameLength.test(names.get(i),Integer.parseInt(commandsData[2]))){
                                names.remove(i);
                            }
                        }
                    }
                    break;
                case "Double":
                    if (commandsData[1].equalsIgnoreCase("StartsWith")) {
                        for (int i = names.size()-1 ;i >=0 ; i--) {
                            if (isItstartingWith.test(names.get(i),commandsData[2])){
                                names.add(names.get(i));
                            }
                        }

                    }else if (commandsData[1].equalsIgnoreCase("EndsWith")){
                        for (int i = names.size()-1 ;i >=0 ; i--) {
                            if (isItEndsWith.test(names.get(i),commandsData[2])){
                                names.add(names.get(i));
                            }
                        }

                    }else if (commandsData[1].equalsIgnoreCase("Length")){
                        for (int i = names.size()-1 ;i >=0 ; i--) {
                            if (isItTheSameLength.test(names.get(i),Integer.parseInt(commandsData[2]))){
                                names.add(names.get(i));
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        Collections.sort(names);
        if (!names.isEmpty()){
            System.out.println(names.toString().replaceAll("[\\]\\[]","")+" are going to the party!");

        }else{
            System.out.println("Nobody is going to the party!");
        }

    }
}
