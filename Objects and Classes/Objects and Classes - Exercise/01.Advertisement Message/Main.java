package Objectandclass.AdvertisementMessage;

import javax.annotation.processing.Messager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Masseges masseg = new Masseges();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            System.out.println(masseg.randomMassege());
        }

    }
}
