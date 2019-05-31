package StreamsFilesАndDirectories.Exercises;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p04CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "D:\\SoftUni\\SoftUni\\Java Advance\\Streams Files and Directories Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try (BufferedReader in = new BufferedReader(new FileReader(inputPath))) {
            String line = in.readLine();
            List<String> words = new ArrayList<>();

            while (line != null) {
                String[] data = line.split("\\s+");
                Collections.addAll(words, data);
                line = in.readLine();
            }

            int vowels = 0;
            int consonats = 0;
            int punctuations = 0;
            String vowel = "aeiou";
            String punctuation = ",.!?";
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if (vowel.contains(String.valueOf( word.charAt(i)))){
                        vowels++;
                    }else if (punctuation.contains(String.valueOf( word.charAt(i)))){
                        punctuations++;
                    }else {
                        consonats++;
                    }

                }
            }
            System.out.println("Vowels: "+vowels);
            System.out.println("Consonants: "+consonats);
            System.out.println("Punctuation: "+punctuations);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

