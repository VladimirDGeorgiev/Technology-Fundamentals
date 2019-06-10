package StreamsFilesАndDirectories.Lab;

import java.io.*;

public class p03CopyBytes {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try(FileInputStream fileInputStream = new FileInputStream(inputPath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputPath)){
            int oneByte = fileInputStream.read();

            while (oneByte>=0){
                if (oneByte==10||oneByte==32){
                    fileOutputStream.write(oneByte);
                }else{
                    String digit = String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        fileOutputStream.write(digit.charAt(i));
                    }
                }


                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
