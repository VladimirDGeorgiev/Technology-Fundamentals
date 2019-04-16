package Objectandclass.Articles_2_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Articles2> result = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            String[] input = scanner.nextLine().trim().split(", ");
            result.add(new Articles2(input[0],input[1],input[2]));
        }
        switch (scanner.nextLine().toLowerCase().trim()){
            case "title":result.stream().sorted((p1,p2)->p1.getTitle().compareTo(p2.getTitle())).forEach(e->{
                System.out.println(e.toString());
            });
                break;
            case "content":result.stream().sorted((p1,p2)->p1.getContent().compareTo(p2.getContent())).forEach(e->{
                System.out.println(e.toString());
            });
                break;
            case "author":result.stream().sorted((p1,p2)->p1.getTitle().compareTo(p2.getTitle())).forEach(e->{
                System.out.println(e.toString());
            });
                break;
                default:break;
        }

    }
}
