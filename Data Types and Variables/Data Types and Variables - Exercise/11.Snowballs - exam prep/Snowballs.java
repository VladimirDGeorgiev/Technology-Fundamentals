import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long sum = 0;
        long outputSnow = 0;
        long outputTime = 0;
        long outputQuality = 0;
        long outputValue = 0;

        for (int i = 0; i <n ; i++) {

            long snowBallSnow = Integer.parseInt(scanner.nextLine());
            long snowBallTime = Integer.parseInt(scanner.nextLine());
            long snowBallQuality = Integer.parseInt(scanner.nextLine());
            long snowBallValue=(long)Math.pow((snowBallSnow/snowBallTime),snowBallQuality);;
            if (snowBallValue>sum){
                outputSnow=snowBallSnow;
                outputTime=snowBallTime;
                outputQuality=snowBallQuality;
                outputValue=snowBallValue;
                sum=snowBallValue;

            }

        }
        System.out.println(String.format("%d : %d = %d (%d)",outputSnow,outputTime,outputValue,outputQuality));
    }
}
