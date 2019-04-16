import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long sum = 0;

        for (int i = 0; i <n ; i++) {

            long a = Long.parseLong(scanner.next());
            long b = Long.parseLong(scanner.next());

            if (a>b){
                String aString = String.valueOf(a);
                for (int j = 0; j <aString.length() ; j++) {
                    char ronge = aString.charAt(j);
                    if (ronge=='-')
                    {
                        continue;
                    }
                    sum+=Integer.parseInt(String.valueOf(aString.charAt(j)));

                }
                System.out.println(sum);
            }
            else{
                String bString = String.valueOf(b);
                for (int k = 0; k <bString.length() ; k++) {
                    char ronge = bString.charAt(k);
                    if (ronge=='-')
                    {
                        continue;
                    }
                    sum+=Integer.parseInt(String.valueOf(bString.charAt(k)));

                }
                System.out.println(sum);

            }
            sum=0;

        }

    }
}
