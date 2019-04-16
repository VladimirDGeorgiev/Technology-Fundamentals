package Objectandclass.Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> students = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            double grade = Double.parseDouble(input[2]);
            students.add(new Students(input[0],input[1],grade));
        }
        students.stream().sorted((p1,p2)->Double.compare(p2.getGrade(),p1.getGrade()))
                .forEach(e->{
                    System.out.println(e.toString());
                });
    }
}
