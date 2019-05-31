package StreamsFilesАndDirectories.Lab;

import java.io.*;

public class p02WriteToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try(FileInputStream fileInputStream = new FileInputStream(inputPath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath)){
            int oneByte = fileInputStream.read();

            while (oneByte>=0){
                if (oneByte!='.'&&
                        oneByte!=','&&
                        oneByte!='!'&&
                        oneByte!='?'){
                    fileOutputStream.write(oneByte);
                }
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
