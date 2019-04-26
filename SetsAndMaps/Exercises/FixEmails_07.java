package SetsAndMaps.Exercises;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LinkedHashMap<String,String> mapEmail = new LinkedHashMap<>();
        String domainIgnor = "us uk com";
        while (!name.equals("stop")){
            String email = scanner.nextLine();
            String emailDomain = String.valueOf(email.charAt(email.length()-2))+ email.charAt(email.length() - 1);
            if (!domainIgnor.contains(emailDomain.toLowerCase())){
                mapEmail.putIfAbsent(name,email);
            }
            name = scanner.nextLine();
        }
        mapEmail.forEach((key,value)->{
            System.out.println(String.format("%s -> %s",key,value));
        });
    }
}
