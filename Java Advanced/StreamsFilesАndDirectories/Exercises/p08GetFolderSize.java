package StreamsFilesАndDirectories.Exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class p08GetFolderSize {
    public static void main(String[] args) {
        Path folder = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        try {
            long size = Files.walk(folder)
                    .filter(p -> p.toFile().isFile())
                    .mapToLong(p -> p.toFile().length())
                    .sum();
            System.out.println("Folder size: " + size);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

