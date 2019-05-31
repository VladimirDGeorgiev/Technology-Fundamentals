package StreamsFilesАndDirectories.Lab;

import java.io.*;

public class p05WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try(BufferedReader in = new BufferedReader(new FileReader(inputPath));
            PrintWriter out = new PrintWriter(new FileWriter(outputPath));){
            String line = in.readLine();
            int count = 1;
            while (line != null){
                if (count++%3==0){
                    out.println(line);
                }
                line = in.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
