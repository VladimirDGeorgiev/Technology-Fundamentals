package TextProcessingandRegularExpressions.Lab;

import java.util.Scanner;

public class Substring02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String data = scanner.nextLine();
        while (data.contains(key)){
           int index = data.indexOf(key);
            data = data.substring(0,index)+data.substring(index+key.length());

        }
        System.out.println(data);
    }
}
