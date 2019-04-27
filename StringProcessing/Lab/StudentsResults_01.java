package StringProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsResults_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentData = scanner.nextLine().split(" - ");
        String studentName = studentData[0];
        double[] studentGrades = Arrays.stream(studentData[1].split(", ")).mapToDouble(Double::parseDouble).toArray();
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|"
                ,"Name","JAdv","JavaOOP","AdvOOP","Average"));
        double average = (studentGrades[0]+studentGrades[1]+studentGrades[2])/3;
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|"
                ,studentName,studentGrades[0],studentGrades[1],studentGrades[2],average));
    }
}
