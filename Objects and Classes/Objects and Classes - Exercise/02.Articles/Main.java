package Objectandclass.Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        Articles articles = new Articles(data[0],data[1],data[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().split(": ");
            switch (input[0]){
                case "Edit":
                    articles.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(input[1]);
                    break;
                case "Rename":
                    articles.rename(input[1]);
                    break;
                default:
                    break;
            }
        }
        System.out.println(articles);
    }
}
