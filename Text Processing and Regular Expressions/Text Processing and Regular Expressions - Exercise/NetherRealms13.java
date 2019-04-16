package TextProcessingandRegularExpressions.Exers;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s*,\\s*"); // от двете страни на запетайката може да има празни места
        Map<String, Double[]> demonBook = new TreeMap<>();
        String digits = "[-+]?[0-9]+[\\.]{1}[0-9]+|[-+]?[0-9]+";
        Pattern patternDigits = Pattern.compile(digits);
        for (int i = 0; i <input.length ; i++) {
            String denom = input[i];
            int helthSum = 0;
            double damage = 0;

            String demonLeathers = denom.replaceAll("[0-9\\-*+\\/\\.]","");
            for (int j = 0; j <demonLeathers.length() ; j++) {
                    helthSum += demonLeathers.charAt(j);
            }
            Matcher matcherDiits = patternDigits.matcher(denom);
            while (matcherDiits.find()){
                damage+=(Double.parseDouble(matcherDiits.group()));
            }
            for (int k = 0; k <denom.length() ; k++) {
                if(String.valueOf(denom.charAt(k)).equals("*")){
                    damage*=2;
                }else if (String.valueOf(denom.charAt(k)).equals("/")){
                    damage/=2;
                }
            }
            demonBook.put(denom,new Double[2]);
            demonBook.get(denom)[0]=damage;
            demonBook.get(denom)[1]=(1.0*helthSum);
        }
        demonBook.forEach((key, value) -> System.out.println(String.format("%s - %.0f health, %.2f damage", key, value[1], value[0])));
    }
}
