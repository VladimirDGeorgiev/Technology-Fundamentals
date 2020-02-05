package StreamsFilesАndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class p04ExtractIntegers {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try(Scanner scanner = new Scanner(new FileInputStream(path))){
            while (scanner.hasNext()){
                if (scanner.hasNextInt()){
                    System.out.println(scanner.nextInt());
                }
                scanner.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
