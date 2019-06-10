package ExamPreparation_JavaAdvanced.Archive_AdvancedJava_Exams.JavaAdvancedRetakeExam_27August2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03Mission {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String completeMissionName = "";
        String failedMissionName = "";
        int completeMissionRating = Integer.MIN_VALUE;
        int failedMissionNameRating = Integer.MIN_VALUE;

        String encryptedMessege = "";
        while (!"Decrypt".equals(encryptedMessege= reader.readLine())){
            StringBuilder upperCase = new StringBuilder();
            StringBuilder lowerCase = new StringBuilder();
            int sumDigits = 0 ;
            for (int i = 0; i < encryptedMessege.length(); i++) {
                if (Character.isDigit(encryptedMessege.charAt(i))){
                    sumDigits+= Integer.parseInt(String.valueOf(encryptedMessege.charAt(i))) ;
                }else if(Character.isUpperCase(encryptedMessege.charAt(i))){
                    upperCase.append(encryptedMessege.charAt(i));

                }else if (Character.isLowerCase(encryptedMessege.charAt(i))){
                    lowerCase.append(encryptedMessege.charAt(i));
                }
            }
            if (upperCase.toString().contains("M")&&
                    upperCase.toString().contains("I")&&
                    upperCase.toString().contains("S")&&
                    upperCase.toString().contains("O")&&
                    upperCase.toString().contains("N")
            ){
                if (upperCase.toString().contains("C")&&sumDigits>completeMissionRating){
                    completeMissionName = lowerCase.toString();
                    completeMissionRating = sumDigits;

                }
                if (upperCase.toString().contains("X")&&sumDigits>failedMissionNameRating){
                    failedMissionName= lowerCase.toString();
                    failedMissionNameRating=sumDigits;
                }
            }
        }
        System.out.printf("Completed mission %s with rating: %d%n",completeMissionName,completeMissionRating);
        System.out.printf("Failed Mission %s with rating: %d%n",failedMissionName,failedMissionNameRating);
    }
}
