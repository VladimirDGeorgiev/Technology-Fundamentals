package PreparetioForMidExam;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PresentDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("[@+]")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        int startPositionIndex = 0;//Santa position
        int lastPositioIndex = 0;

        while (!"Merry Xmas!".equals(command)) {
            String[] data = command.split("\\s+");
            int lenght = Integer.parseInt(data[1]);

            if (data[0].equals("Jump")) {                           // въртене на масива
                lastPositioIndex = startPositionIndex + lenght;
                while (lastPositioIndex >= input.size()) {
                    lastPositioIndex -= input.size();
                }
                startPositionIndex = lastPositioIndex;

                setSantaGift(input, startPositionIndex);
            }
            command = scanner.nextLine();
        }
        System.out.println(String.format("Santa's last position was %d.", startPositionIndex));
        boolean missionSuccess = true;
        int housesCount = 0;
        for (Integer i : input) {
            if (i > 0) {
                missionSuccess = false;
                housesCount++;
            }
        }
        if (missionSuccess) {
            System.out.println("Mission was successful.");
        } else {
            System.out.println(String.format("Santa has failed %d houses.", housesCount));
        }
    }

    private static void setSantaGift(List<Integer> input, int lastPositionIndex) {
        if (input.get(lastPositionIndex) != 0) {
            input.set(lastPositionIndex, input.get(lastPositionIndex) - 2);
        } else {
            System.out.println(String.format("House %d will have a Merry Christmas.", lastPositionIndex));
        }
    }
}
