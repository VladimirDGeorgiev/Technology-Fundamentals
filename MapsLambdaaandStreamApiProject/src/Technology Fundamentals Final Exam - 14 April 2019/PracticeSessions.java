package FinalExam;

        import java.sql.SQLOutput;
        import java.util.*;

public class PracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, ArrayList<String>> result = new TreeMap<>();

        while (!input.equalsIgnoreCase("END")) {
            String[] data = input.split("->");
            if (data.length == 3) {//Add
                String road = data[1];
                String racer = data[2];
                result.putIfAbsent(road,new ArrayList<>());
                result.get(road).add(racer);


            } else if (data.length == 4) {//Move
                String currentRoad = data[1];
                String racer = data[2];
                String nextRoad = data[3];
                if (result.get(currentRoad).contains(racer)){
                    result.get(currentRoad).remove(racer);
                    result.get(nextRoad).add(racer);
                }

            } else if (data.length == 2) {//Close
                String road = data[1];
                if (result.containsKey(road)){
                    result.remove(road);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Practice sessions:");
        result.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue().size(),a.getValue().size())).
                forEach(e->{
                    System.out.println(e.getKey());
                    e.getValue().forEach(e1->{
                        System.out.println(String.format("++%s",e1));
                    });

                });
    }
}
