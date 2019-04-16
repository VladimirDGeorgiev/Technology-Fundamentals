package TextProcessingandRegularExpressions.Exers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "\\@(?<planet>[A-Za-z]+)[^@\\-!:>]*\\:(?<population>[0-9]+)[^@\\-!:>]*\\!(?<atackType>[AD]{1})\\!(?:[^@\\-!:>]*)\\-\\>(?<soldiers>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Map<String, ArrayList<String>> resultMap = new LinkedHashMap<>();
        resultMap.put("A",new ArrayList<>());
        resultMap.put("D",new ArrayList<>());
        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();
            int count = 0;
            for (int j = 0; j <command.length() ; j++) {
                if (String.valueOf(command.charAt(j)).equalsIgnoreCase("s")||
                        String.valueOf(command.charAt(j)).equalsIgnoreCase("t")||
                        String.valueOf(command.charAt(j)).equalsIgnoreCase("a")||
                        String.valueOf(command.charAt(j)).equalsIgnoreCase("r")){
                    count++;
                }
            }
            StringBuilder resultString = new StringBuilder();
            for (int k = 0; k <command.length() ; k++) {
                int temp = command.charAt(k)-count;
                resultString.append(Character.toChars(temp));
            }
            Matcher matcher = pattern.matcher(resultString);
            while (matcher.find()){
                String planet = matcher.group("planet");

                String atackType = matcher.group("atackType");

                resultMap.get(atackType).add(planet);
            }

        }
        resultMap.entrySet().stream().forEach(e->{
            if (e.getKey().equals("A")){
                System.out.println(String.format("Attacked planets: %d",e.getValue().size()));
                e.getValue().stream().sorted(Comparator.naturalOrder())
                        .forEach(e1-> System.out.println(String.format("-> %s",e1)));
            }
            if (e.getKey().equals("D")){
                System.out.println(String.format("Destroyed planets: %d",e.getValue().size()));
                e.getValue().stream().sorted(Comparator.naturalOrder())
                        .forEach(e2-> System.out.println(String.format("-> %s",e2)));
            }


        });

    }
}
