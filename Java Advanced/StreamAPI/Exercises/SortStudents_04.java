package StreamAPI.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class SortStudents_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().trim();
        ArrayList<Name> names = new ArrayList<>();

        while (!input.equals("END")){
            String[] data = input.split("\\s+");
            names.add(new Name(data[0],data[1]));
            input = reader.readLine().trim();
        }

      names.stream().sorted((a,b)->{
          int comp= b.getFirst().compareTo(a.getFirst());
          return Integer.compare(comp, 0);
      }).sorted((b,a)->{
         int comp= b.getLast().compareTo(a.getLast());
          return Integer.compare(comp, 0);
      }).forEach(n->{
          System.out.println(n.getFirst()+" "+n.getLast());
      });

    }
    public static class Name{
        private String first;
        private String last;

        public Name() {
        }

        public Name(String first, String last) {
            this.first = first;
            this.last = last;
        }

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }
    }
}

