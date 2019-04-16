package TextProcessingandRegularExpressions.Exers;

        import java.util.Scanner;

public class MultiplyBigNumber05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fisrt = scanner.nextLine();
        int second =Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        int ostatyk = 0;
        if (second==0){
            System.out.println(0);
            return;
        }
        for (int i = fisrt.length()-1; i >=0 ; i--) {
            int number = Integer.parseInt(String.valueOf(fisrt.charAt(i)));
            int sum = (number*second)+ostatyk;
            String sumString = String.valueOf(sum);
            if (sum<10){
                ostatyk=0;
                result.insert(0,sumString);
            }else{
                String[] data = sumString.split("");
                ostatyk=Integer.parseInt(data[0]);
                result.insert(0,data[1]);
            }
        }
        if (ostatyk>0){
            result.insert(0,ostatyk);
        }
        System.out.println(result);
    }
}
