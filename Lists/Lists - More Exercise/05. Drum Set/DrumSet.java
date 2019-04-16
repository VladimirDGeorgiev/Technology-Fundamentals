package ListExer;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings =Double.parseDouble(scanner.nextLine());
        List<Integer> startQuality = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> currentQuality = new ArrayList<>(startQuality);
        String command = scanner.nextLine();
        while (!command.equals("Hit it again, Gabsy!")){//27 2 4 7
            int hitPower = Integer.parseInt(command);
            for (int i = 0; i <currentQuality.size() ; i++) {
                currentQuality.set(i,currentQuality.get(i)-hitPower);
                if (currentQuality.get(i)<=0){
                    if (savings>=startQuality.get(i)*3) {
                        currentQuality.set(i, startQuality.get(i));
                        savings -= startQuality.get(i) * 3;
                    }else{

                        currentQuality.remove(i);
                        startQuality.remove(i);
                        i--;

                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(currentQuality.toString().replaceAll("[\\[,\\]]",""));
        System.out.println(String.format("Gabsy has %.2flv.",savings));

    }
}
