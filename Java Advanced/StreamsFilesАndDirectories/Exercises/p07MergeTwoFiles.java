package StreamsFilesАndDirectories.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p07MergeTwoFiles {
    public static void main(String[] args) {
        Path firstInputPath = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path secondInputPath = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        Path outputPath = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        try {
            List<String> first = Files.readAllLines(firstInputPath);
            List<String> second = Files.readAllLines(secondInputPath);
            first.addAll(second);
            System.out.println();

           Files.write(outputPath,first);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
