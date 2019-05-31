package StreamsFilesАndDirectories.Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p02SumBytes {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader in = new BufferedReader(new FileReader(path))){
            String line = in.readLine();
            int sum = 0;
            while (line!=null){
                for (char c : line.toCharArray()) {
                    sum+=c;
                }
                line = in.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
