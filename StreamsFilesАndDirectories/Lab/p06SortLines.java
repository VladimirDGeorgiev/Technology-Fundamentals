package StreamsFilesАndDirectories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p06SortLines {
    public static void main(String[] args) {
        Path inputPath = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        Path outputPath = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt");

        try {
            List<String> lines = Files.readAllLines(inputPath);
            lines=lines.stream().filter(e->!e.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(outputPath,lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
