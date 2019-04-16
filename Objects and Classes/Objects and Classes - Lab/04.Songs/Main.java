package Objectandclass.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> playList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String[] data = scanner.nextLine().split("_");
            Song song = new Song();
            song.setTypeList(data[0]);
            song.setName(data[1]);
            song.setTime(data[2]);
            playList.add(song);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song i : playList) {
                System.out.println(i.getName());

            }
        } else {
            for (Song i : playList) {
                if (i.getTypeList().equals(typeList)) {
                    System.out.println(i.getName());
                }

            }
        }
    }

}
