package StreamsFilesАndDirectories.Exercises;

import java.io.*;

public class p03ALLCAPITALS {
    public static void main(String[] args) {
        String inputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            String line = in.readLine();
            while (line!=null){
               out.println(line.toUpperCase());
                line = in.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
