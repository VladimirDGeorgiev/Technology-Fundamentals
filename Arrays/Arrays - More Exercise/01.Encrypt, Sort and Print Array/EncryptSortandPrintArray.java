import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] result = new int[n];

        for (int i = 0; i <n ; i++) {
            sum = 0;
            String[] name = scanner.nextLine().split("");
            char[] names = new char[name.length];
            for (int k = 0; k <names.length ; k++) {
                names[k]=name[k].charAt(0) ;
            }


            for (int j = 0; j <name.length ; j++) {
                if (names[j]=='a'||names[j]=='A'
                        ||names[j]=='e'||names[j]=='E'
                        ||names[j]=='o'||names[j]=='O'||
                        names[j]=='u'||names[j]=='U'||
                        names[j]=='i'||names[j]=='I'
                ){
                    sum+=(names[j]*names.length);
                }
                else{
                    sum+=(names[j]/names.length);
                }
            }

            result[i]=sum;
        }


        for (int i = 0; i <result.length ; i++) {
            for (int j = i+1; j <result.length ; j++) {
                if (result[i] > result[j])

                {
                    int temp =0;
                    temp = result[i];

                    result[i] = result[j];

                    result[j] = temp;

                }
            }
        }

        for (int i:result ) {
            System.out.println(i);

        }

    }
}
