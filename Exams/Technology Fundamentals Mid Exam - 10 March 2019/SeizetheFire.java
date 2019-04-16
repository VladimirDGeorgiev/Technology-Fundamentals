package MidExam;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SeizetheFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\#+"))
                .collect(Collectors.toList());
        int water = Integer.parseInt(scanner.nextLine());
        double efford = 0;
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i <input.size() ; i++) {
            String[] data = input.get(i).split(" = "); // възможно е да са повече от един спеис и равно
            String fireType = data[0];
            int rangeOfFire = Integer.parseInt(data[1]);

            switch (fireType.toLowerCase()){
                case "high":
                    if (rangeOfFire>=81&&rangeOfFire<=125){
                        if (water>=rangeOfFire) {
                            water -= rangeOfFire;
                            resultList.add(rangeOfFire);
                            efford += 1.0*rangeOfFire*0.25;
                        }
                    }
                    break;
                case "medium":
                    if (rangeOfFire>=51&&rangeOfFire<=80){
                        if (water>=rangeOfFire) {
                            water -= rangeOfFire;
                            resultList.add(rangeOfFire);
                            efford += 1.0*rangeOfFire*0.25;
                        }
                    }
                    break;
                case "low": if (rangeOfFire>=1&&rangeOfFire<=50){
                    if (water>=rangeOfFire) {
                        water -= rangeOfFire;
                        resultList.add(rangeOfFire);
                        efford += 1.0*rangeOfFire*0.25;
                    }
                }
                    break;
                default:
                    break;
            }

        }
        int sum = 0;
        System.out.println("Cells:");
        for (Integer j:resultList
        ) {
            System.out.println(String.format(" - %d",j));
            sum +=j;

        }
        System.out.println(String.format("Effort: %.2f",efford));
        System.out.println(String.format("Total Fire: %d",sum));
    }
}
