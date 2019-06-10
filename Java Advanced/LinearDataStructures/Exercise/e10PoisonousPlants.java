package LinearDataStructures.Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class e10PoisonousPlants {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Long> plants = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toList());
        ArrayDeque<Integer> indexForRemove = new ArrayDeque<>();
        int days = 0;

        while (true) {
            long temp = plants.get(0);

            for (int i = 1; i < plants.size(); i++) {
                if (temp < plants.get(i)) {
                    indexForRemove.push(i);
                }
                temp = plants.get(i);
            }
            if (indexForRemove.isEmpty()) {
                break;
            } else {
                days++;
                while (!indexForRemove.isEmpty()) {
                    int index = indexForRemove.pop();
                    plants.remove(index);
                }
            }
        }
        System.out.println(days);
    }
}
