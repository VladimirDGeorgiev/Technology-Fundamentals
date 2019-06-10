package StreamsFilesАndDirectories.Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p01SumLines {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader in = new BufferedReader(new FileReader(path))){
            String line = in.readLine();
            while (line!=null){
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum+=line.charAt(i);
                }
                System.out.println(sum);
                line = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
