package HashMapsandStream.Exercise.moreExer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ranking {
    public static void main(String[] args) {
 //     Scanner scanner = new Scanner(System.in);
 //     String command = scanner.nextLine();
 //     Map<String, String> contests = new LinkedHashMap<>();

 //     while (!command.equalsIgnoreCase("end of contests")){
 //         String[] data = command.split(":+");
 //         contests.putIfAbsent(data[0],"");
 //         contests.put(data[0],data[1]);
 //         command = scanner.nextLine();
 //     }
 //     command = scanner.nextLine();
 //     Map<String,LinkedHashMap<String,Integer>> results = new TreeMap<>();

 //     while (!command.equalsIgnoreCase("end of submissions")){
 //         String[] data1 = command.split("=>");
 //         String contest = data1[0];
 //         String password = data1[1];
 //         String username = data1[2];
 //         int points = Integer.parseInt(data1[3]);
 //         if (contests.containsKey(contest)){
 //             if (contests.get(contest).equalsIgnoreCase(password)){
 //                 results.putIfAbsent(username,new LinkedHashMap<>());
 //                 results.get(username).putIfAbsent(contest,0);
 //                 if (results.get(username).get(contest)<points)
 //                 results.get(username).put(contest,points);
 //             }
 //         }

 //         command = scanner.nextLine();
 //     }
 //     final String[] winnerUser = {""};
 //     final int[] winnerPointsSum = {0};

 //     results.forEach((key,value)->{
 //         int tempSum =0;
 //         for (Map.Entry<String, Integer> entry : value.entrySet()) {
 //             Integer value1 = entry.getValue();
 //             tempSum += value1;
 //         }
 //         if (tempSum> winnerPointsSum[0]){
 //             winnerPointsSum[0] =tempSum;
 //             winnerUser[0] = key;
 //         }
 //     });
 //     System.out.println(String.format("Best candidate is %s with total %d points."
 //             ,winnerUser[0], winnerPointsSum[0]));
 //     System.out.println("Ranking:");
 //     results.entrySet().stream().forEach(e->{
 //         System.out.println(e.getKey());
 //         e.getValue().entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
 //                 .forEach(m-> System.out.println(String.format("#  %s -> %d",m.getKey(),m.getValue())));
 //     });
 }
}
