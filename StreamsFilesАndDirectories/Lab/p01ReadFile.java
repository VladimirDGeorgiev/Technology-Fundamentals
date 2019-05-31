package StreamsFilesАndDirectories.Lab;

import java.io.*;

public class p01ReadFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try(FileInputStream fileInputStream = new FileInputStream(path)){
            int oneByte = fileInputStream.read();

            while (oneByte>=0){
                System.out.print(Integer.toBinaryString(oneByte)+" ");
                oneByte=fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
