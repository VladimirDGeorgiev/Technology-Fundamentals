package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Robotics_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //robot arrays register
        String[] robotsInput = scanner.nextLine().split(";");
        String[] robotsNames = new String[robotsInput.length];
        int[] robotsTimes = new int[robotsInput.length];
        int[] robotsTimesInProcess = new int[robotsInput.length];
        boolean[] robotsFree = new boolean[robotsInput.length];
        for (int i = 0; i < robotsInput.length; i++) {
            String[] data = robotsInput[i].split("-");
            robotsNames[i] = data[0];
            robotsTimes[i] = Integer.parseInt(data[1]);
            robotsTimesInProcess[i] = Integer.parseInt(data[1]);
            robotsFree[i] = true;
        }
        //Time in seconds
        String[] startingTime = scanner.nextLine().split(":");
        int hour = Integer.parseInt(startingTime[0]);
        int minutes = Integer.parseInt(startingTime[1]);
        int seconds = Integer.parseInt(startingTime[2]);
        long curentTime = (hour * 3600) + (minutes * 60) + seconds;
        //Queue of items to assembly
        String input = scanner.nextLine();
        ArrayDeque<String> products = new ArrayDeque<>();
        while (!input.equalsIgnoreCase("end")) {
            products.add(input);
            input = scanner.nextLine();
        }
        //Calculations
        while (!products.isEmpty()) {
            curentTime++;
            String item = products.remove();
            boolean isThereFreeRobot = false;
            //Searching for free robot
            for (int i = 0; i < robotsFree.length; i++) {
                if (robotsFree[i]) {
                    robotsFree[i] = false;
                    System.out.println(String.format("%s - %s %s", robotsNames[i], item, getCurrentTime(curentTime)));
                    isThereFreeRobot = true;
                    break;
                }
            }
            //If there is no free robot
            if (!isThereFreeRobot) {
                products.add(item);
            }
            setRobotsTimesInProcess(robotsTimes, robotsTimesInProcess, robotsFree);
        }

    }

    private static void setRobotsTimesInProcess(int[] robotsTimes, int[] robotsTimesInProcess, boolean[] robotsFree) {
        for (int j = 0; j < robotsFree.length; j++) {
            if (!robotsFree[j]) {
                robotsTimesInProcess[j]--;
                if (robotsTimesInProcess[j] <= 0) {
                    robotsTimesInProcess[j] = robotsTimes[j];
                    robotsFree[j] = true;

                }
            }
        }
    }

    private static String getCurrentTime(long currentSeconds) {
        long hours = ((int) (currentSeconds / 3600)) % 24;
        long remainder = currentSeconds % 3600;
        long minutes = remainder / 60;
        long seconds = remainder % 60;

        return String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
