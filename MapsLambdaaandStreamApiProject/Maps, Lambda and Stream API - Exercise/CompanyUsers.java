package HashMapsandStream.Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, ArrayList<String>> result = new TreeMap<>();
        while (!command.equalsIgnoreCase("end")){
            String[] data = command.split(" -> ");
            String companyName = data[0];
            String employed = data[1];
            result.putIfAbsent(companyName, new ArrayList<>());
            if (!result.get(companyName).contains(employed)) {
                result.get(companyName).add(employed);
            }
            command = scanner.nextLine();
        }
        result.entrySet().stream().
                forEach(e->{ System.out.println(e.getKey());e.getValue().stream().
                        forEach(j-> System.out.println("-- "+j));});
    }
}
