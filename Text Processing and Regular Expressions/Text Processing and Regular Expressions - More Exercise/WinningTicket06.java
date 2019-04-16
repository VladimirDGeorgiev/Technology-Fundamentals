package TextProcessingandRegularExpressions.moreExers;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex10 = "([@$#^]{10}).*(\\1)";
        String regex69 = "([@$#^]{6,9}).*(\\1)";
        Pattern pattern10 = Pattern.compile(regex10);
        Pattern pattern69 = Pattern.compile(regex69);
        String[] input = scanner.nextLine().split("\\s*,\\s+");

        for (int i = 0; i <input.length ; i++) {
            if (input[i].length()==20){
                Matcher matcher10 = pattern10.matcher(input[i]);
                Matcher matcher69 = pattern69.matcher(input[i]);
                if (matcher10.find()){
                    String symbol =String.valueOf(matcher10.group().charAt(0));
                    System.out.println
                            (String.format("ticket \"%s\" - 10%s Jackpot!"
                                    ,input[i],symbol));
                }else if(matcher69.find()){
                    System.out.println
                            (String.format("ticket \"%s\" - %d%c"
                                    ,input[i],matcher69.group(1).length(),matcher69.group().charAt(0)));
                }else{
                    System.out.println(String.format("ticket \"%s\" - no match",input[i]));
                }
            }else{
                System.out.println("invalid ticket");
            }
        }
    }
}
