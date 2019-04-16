package ExamPreparation;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongEncryptionString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "^(?<artist>[A-Z][a-z' ]+):(?<song>[A-Z ]+)$";
        Pattern pattern = Pattern.compile(regex);
        String command = "";

        while (!(command=scanner.nextLine()).equalsIgnoreCase("end")){
            Matcher matcher = pattern.matcher(command);
            StringBuilder result = new StringBuilder();
            if (matcher.find()){
                int key = matcher.group("artist").length();
                for (int i = 0; i <command.length() ; i++) {
                    int sum =0;
                    if (Character.isUpperCase(command.charAt(i))){
                      sum=  command.charAt(i)+key;
                      if(sum>90){
                          sum-=26;
                      }
                        result.append(Character.toChars(sum));
                    }else if(Character.isLowerCase(command.charAt(i))){
                        sum=  command.charAt(i)+key;
                        if(sum>122){
                            sum-=26;
                        }
                        result.append(Character.toChars(sum));
                    }else if(String.valueOf(command.charAt(i)).equals(":")){
                        result.append("@");
                    }else if(String.valueOf(command.charAt(i)).equals(" ")){
                        result.append(" ");
                    }else if(String.valueOf(command.charAt(i)).equals("'")){
                        result.append("'");
                    }
                }
                System.out.println(String.format("Successful encryption: %s",result));
            }else{
                System.out.println("Invalid input!");
            }

        }
    }
}
