package HashMapsandStream.Exercise.moreExer;

import java.util.*;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, TreeMap<String,Integer>> contestMap = new LinkedHashMap<>();
        Map<String,Integer> usersList = new TreeMap<>();

        while (!command.equalsIgnoreCase("no more time")){
            String[] data = command.split(" -> ");
            String username = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);
            if (!contestMap.containsKey(contest)){
                contestMap.put(contest,new TreeMap<>());
                contestMap.get(contest).put(username,points);
                usersList.putIfAbsent(username,0);
                usersList.put(username,usersList.get(username)+points);
            }else if (!contestMap.get(contest).containsKey(username)){
                    contestMap.get(contest).put(username,points);
                usersList.putIfAbsent(username,0);
                usersList.put(username,usersList.get(username)+points);
            }else if (contestMap.get(contest).containsKey(username)&&contestMap.get(contest).get(username)<points){
                usersList.put(username,usersList.get(username)+(points-contestMap.get(contest).get(username)));
                contestMap.get(contest).put(username,points);

            }
            command = scanner.nextLine();
        }
        contestMap.entrySet().stream().forEach(e->{
            final int[] count = {1};
            System.out.println(String.format("%s: %d participants",e.getKey(),e.getValue().size()));
            e.getValue().entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                    .forEach(r-> {

                        System.out.println(String.format("%d. %s <::> %d", count[0]++,r.getKey(),r.getValue()));
                    });


        });
        System.out.println("Individual standings:");
        int[] count = {1};
        usersList.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                .forEach(e->{
                    System.out.println(String.format("%d. %s -> %d",count[0]++,e.getKey(),e.getValue()));
                });
    }
}
