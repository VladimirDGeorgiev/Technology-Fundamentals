import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long yield = Integer.parseInt(scanner.nextLine());
        long sum = 0;
        long daysCount=0;
        if(yield>=100) {
            while (true) {
                yield -= 26;
                sum += yield;
                daysCount++;
                yield += 16;
                if (yield < 100) {
                    sum -= 26;
                    System.out.println(daysCount);
                    System.out.println(sum);
                    return;

                }

            }
        }
        else {
                System.out.println(0);
                System.out.println(0);
            }
        }
    }

