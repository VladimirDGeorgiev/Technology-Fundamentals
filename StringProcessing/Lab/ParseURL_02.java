package StringProcessing.Lab;

import java.util.Scanner;

public class ParseURL_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(":\\/\\/");
        if (input.length!=2){
            System.out.println("Invalid URL");
            return;
        }
        String protocol = input[0];
        String server = input[1].substring(0,input[1].indexOf("/"));
        String resource = input[1].substring(input[1].indexOf("/")+1);
        System.out.println("Protocol = "+protocol);
        System.out.println("Server = "+server);
        System.out.println("Resources = "+resource);

    }
}
