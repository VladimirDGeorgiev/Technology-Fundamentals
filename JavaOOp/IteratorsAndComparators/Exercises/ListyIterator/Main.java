package JavaOOp.IteratorsAndComparators.Exercises.ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main    {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().substring(6);
        ListyIterator listyIterator = new ListyIterator();
        if (input.length()!=0) {
            String[] arr = input.trim().split("\\s+");
           listyIterator = new ListyIterator(arr);
        }
         input = reader.readLine();
        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            switch (data[0]){
                case "Move":
                    System.out.println(listyIterator.Move());
                    break;
                case "Print":listyIterator.Print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
                default:
                    break;
            }

            input = reader.readLine();
        }
    }
}
