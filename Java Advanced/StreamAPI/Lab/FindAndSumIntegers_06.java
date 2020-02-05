package StreamAPI.Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndSumIntegers_06 {
    private static boolean isNumber(String word){
        String regex = "^[+-]*\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Optional<Integer> sumInt = Arrays.stream(reader.readLine().split("\\s+"))
                .filter(FindAndSumIntegers_06::isNumber)
                .map(Integer::valueOf)
                .reduce((x1,x2)->x1+x2);
        if (sumInt.isPresent()){
            System.out.println(sumInt.get());
        }else{
            System.out.println("No match");
        }
    }

}

