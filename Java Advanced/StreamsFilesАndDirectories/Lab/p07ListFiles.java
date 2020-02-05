package StreamsFilesАndDirectories.Lab;

import java.io.File;

public class p07ListFiles {
    public static void main(String[] args) {
        File file = new File("D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if (file.exists()){
            if (file.isDirectory()){
                File[] files =file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        if (!f.isDirectory()){
                            System.out.printf("%s: [%d]%n",f.getName(),f.length());
                        }
                    }
                }
            }
        }
    }
}
