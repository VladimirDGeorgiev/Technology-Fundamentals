package HashMapsandStream.Exercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String,Integer> userRegister = new TreeMap<>();
        Map<String,Integer> languageRegister = new TreeMap<>();

        while (!command.equalsIgnoreCase("exam finished")){
            String[] data = command.split("-+");
            if (!data[1].equalsIgnoreCase("banned")) {
                String userName = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                userRegister.putIfAbsent(userName, 0);
                if (userRegister.get(userName)<points) {
                    userRegister.put(userName, points);
                }
                languageRegister.putIfAbsent(language, 0);
                languageRegister.put(language, languageRegister.get(language) + 1);
            }else {
                userRegister.remove(data[0]);
            }
            command = scanner.nextLine();

        }

        System.out.println("Results:");
        userRegister.entrySet().stream()
                .sorted((a,b)->Integer.compare(b.getValue(),a.getValue())).
                forEach(e-> System.out.println(e.getKey()+" | "+e.getValue()));
        System.out.println("Submissions:");
        languageRegister.entrySet().stream()
                .sorted((a,b)->Integer.compare(b.getValue(),a.getValue())).
                forEach(e-> System.out.println(e.getKey()+" - "+e.getValue()));
    }
}
