package ListExer;

import java.util.*;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> a = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<String> b = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        while (b.size()!=0&&a.size()!=0) {

            if (a.get(0).equals(b.get(0))) {
                a.remove(0);
                b.remove(0);
            } else if (Integer.parseInt(a.get(0)) >Integer.parseInt( b.get(0))) {
                a.add(a.get(0));
                a.add(b.get(0));
                a.remove(0);
                b.remove(0);

            }else if(Integer.parseInt( b.get(0))>Integer.parseInt(a.get(0)) ){
                b.add(b.get(0));
                b.add(a.get(0));
                b.remove(0);
                a.remove(0);
            }

        }

        int sum = 0;

        if (a.size()>b.size()){
            for (String asd:a) {
                sum+=Integer.parseInt(asd);
            }
            System.out.println(String.format("First player wins! Sum: %d",sum));
        }else{
            for (String asd:b) {
                sum+=Integer.parseInt(asd);
            }
            System.out.println(String.format("Second player wins! Sum: %d",sum));
        }

    }
}
