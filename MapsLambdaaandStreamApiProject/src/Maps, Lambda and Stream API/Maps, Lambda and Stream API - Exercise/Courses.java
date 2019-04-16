package HashMapsandStream.Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> cours = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while (!command.equalsIgnoreCase("end")){
            String[] data = command.split(" : ");
            String courseName = data[0];
            String studentName = data[1];
            cours.putIfAbsent(courseName, new ArrayList<>());
            cours.get(courseName).add(studentName);
            command = scanner.nextLine();
        }
        cours.entrySet().stream().forEach(e-> Collections.sort(e.getValue()));
        cours.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue().size(),a.getValue().size()))
                .forEach(e-> {System.out.println(String.format("%s: %d",e.getKey(),e.getValue().size()));
                e.getValue().stream().forEach(k-> System.out.println(String.format("-- %s",k)));});
    }
}
