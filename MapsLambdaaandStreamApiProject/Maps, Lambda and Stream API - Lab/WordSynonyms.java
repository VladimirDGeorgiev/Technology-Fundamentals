package HashMapsandStream.Exercise.lab;

        import java.util.ArrayList;
        import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<String>> data = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {

            String word1 = scanner.nextLine();
            String sinonim = scanner.nextLine();
            data.putIfAbsent(word1,new ArrayList<>());
            data.get(word1).add(sinonim);
        }
        for (Map.Entry<String,ArrayList<String>> j: data.entrySet()
        ) {
            System.out.println(String.format("%s - %s",j.getKey(),j.getValue().toString().replaceAll("[\\[\\]]","")));
        }
    }
}
