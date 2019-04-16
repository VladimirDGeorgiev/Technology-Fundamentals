package HashMapsandStream.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, ArrayList<String>> data = new TreeMap<>();

        while (!command.equalsIgnoreCase("Lumpawaroo")){
            if (command.contains("|")){
                String[] firstCommand = command.split("\\s+\\|\\s+");
                String side = firstCommand[0];
                String user = firstCommand[1];
                boolean existing = false;
                for (Map.Entry<String,ArrayList<String>> j:data.entrySet()) {
                    if (j.getValue().contains(user)){
                        existing = true;
                        break;
                    }
                }
                if(!existing) {
                    data.putIfAbsent(side, new ArrayList<>());
                    if (!data.get(side).contains(user)) {
                        data.get(side).add(user);
                    }
                }

            }else if (command.contains("->")){
                String[]secondCommand = command.split(" -> ");
                String user2 = secondCommand[0];
                String side2 = secondCommand[1];
                data.entrySet().stream().
                        filter(e->e.getValue().remove(user2)).
                        collect(Collectors.toList());
                data.putIfAbsent(side2,new ArrayList<>());
                if(!data.get(side2).contains(user2)){
                    data.get(side2).add(user2);
                    System.out.println(String.format("%s joins the %s side!",user2,side2));
                }
            }

            command = scanner.nextLine();
        }
        data.entrySet().stream()
                .filter(e->e.getValue().size()>0)
                .sorted((a,b)->Integer.compare(b.getValue().size(),a.getValue().size()))
                .forEach(e->{
            System.out.println(String.format("Side: %s, Members: %d",e.getKey(),e.getValue().size()));
            e.getValue().stream().sorted(Comparator.naturalOrder()).forEach(j-> System.out.println("! "+j));
        });
    }
}
