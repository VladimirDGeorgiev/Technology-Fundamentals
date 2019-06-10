package StreamsFilesАndDirectories.Exercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p06MergeTwoFiles {
    public static void main(String[] args) {
        String inputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String outputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";
        Path path = Paths.get("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            String line = in.readLine();
            Map<String,Integer> wordsCount = new HashMap<>();
            while (line!=null){
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordsCount.putIfAbsent(word,0);
                }
                line = in.readLine();
            }
            List<String> text = Files.readAllLines(path);

            for (String s : text) {
                String[] words =s.split("\\s+");
                for (String word : words) {
                    wordsCount.forEach((key,value)->{
                        if (key.equals(word)){
                            wordsCount.put(key,wordsCount.get(key)+1);
                        }
                    });
                }
            }
            wordsCount.entrySet().stream()
                    .sorted((a,b)->Integer.compare(b.getValue(),a.getValue()))
                    .forEach(e->{
                        System.out.println(e.getKey()+" - "+e.getValue());
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
