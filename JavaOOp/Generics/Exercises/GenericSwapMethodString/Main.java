package JavaOOp.Generics.Exercises.GenericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(reader.readLine());
        }
        int[] indexs = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        SwapElementsOfList.swap(newList,indexs[0],indexs[1]);
        for (String e : newList) {
            SwapElementsOfList<String> element = new SwapElementsOfList<>(e);
            System.out.println(element.toString());
        }

    }

}

