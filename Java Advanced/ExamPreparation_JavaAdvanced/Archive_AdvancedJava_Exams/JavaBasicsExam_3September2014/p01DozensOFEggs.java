package ExamPreparation_JavaAdvanced.Archive_AdvancedJava_Exams.JavaBasicsExam_3September2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01DozensOFEggs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 1; i <=7 ; i++) {
            String[] command = reader.readLine().split("\\s+");
            int numberOfEgg = Integer.parseInt(command[0]);
            sum+= command[1].equals("dozens") ? 12 * numberOfEgg : numberOfEgg;
        }
            int dozens = sum / 12;
            int eggs = sum % 12;
                System.out.println(String.format("%d dozens + %d eggs",dozens,eggs));

    }
}
