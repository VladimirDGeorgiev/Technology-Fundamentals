package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();


        for (int i = 0; i < number; i++) {
            int count = 0;
            String result = "";
            String inputData = scanner.nextLine();

            for (int j = 0; j < inputData.length(); j++) {
                if (String.valueOf(inputData.charAt(j)).equalsIgnoreCase("s") ||
                        String.valueOf(inputData.charAt(j)).equalsIgnoreCase("t") ||
                        String.valueOf(inputData.charAt(j)).equalsIgnoreCase("a") ||
                        String.valueOf(inputData.charAt(j)).equalsIgnoreCase("r")) {
                    count++;
                }
            }
            for (int k = 0; k < inputData.length(); k++) {
                result += (char) (inputData.charAt(k) - count);
            }

            String regex = "@(?<name>[A-Za-z]+)([^@\\-!:>]*):(?<population>[0-9]+)([^@\\-!:>]*)!(?<type>[A|D])!([^@\\-!:>]*)->(?<soldier>[0-9]+)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(result);
            if (matcher.find()) {
                String planetname = matcher.group("name");
                String type = matcher.group("type");
                if (type.equals("A")) {
                    attacked.add(planetname);
                } else {
                    destroyed.add(planetname);
                }
            }
        }
        System.out.println(String.format("Attacked planets: %d", attacked.size()));
        attacked.stream().sorted().forEach(e -> {
            System.out.println(String.format("-> %s", e));
        });

        System.out.println(String.format("Destroyed planets: %d", destroyed.size()));
        destroyed.stream().sorted().forEach(e -> {
            System.out.println(String.format("-> %s", e));
        });
    }
}
