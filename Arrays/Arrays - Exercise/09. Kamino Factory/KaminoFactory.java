import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      int size = Integer.parseInt(scanner.nextLine());
      int bestSequenceindex = Integer.MAX_VALUE;
      int bestSequenceSum = 0;
      int bestSequenceIndexRowOutput=0;

      String input ="";

      while (!"Clone them!".equals(input=scanner.nextLine())){
          ++bestSequenceIndexRowOutput;
          String[] data = Arrays.stream(input.split("!+"))
                  .filter(e->!e.equals("")).toArray(String[]::new);

          int[] sequenceDNA = new int[size];
          for (int i = 0; i <data.length ; i++) {
              sequenceDNA[i]=Integer.parseInt(data[i]);
          }
            int maxCount = 0 ;
            int sequenseIndex = 0;
          for (int i = 0; i <sequenceDNA.length ; i++) {
              int currentCount = 0;
              for (int j = i; j <sequenceDNA.length ; j++) {
                  if (sequenceDNA[i]==sequenceDNA[j]){
                      currentCount++;
                      if (currentCount>maxCount){
                          maxCount=currentCount;
                          sequenseIndex = i;
                      }
                  }else{
                      break;
                  }
              }

          }
          int sequenseSum = 0;
          for (int i = 0; i <sequenceDNA.length ; i++) {
              if (sequenceDNA[i]==1) {
                  sequenseSum += sequenceDNA[i];
              }
          }

          if (sequenseIndex<bestSequenceindex){
              bestSequenceindex=sequenseIndex;
          }
          System.out.println(sequenseIndex);
          System.out.println();
      }
    }

}
