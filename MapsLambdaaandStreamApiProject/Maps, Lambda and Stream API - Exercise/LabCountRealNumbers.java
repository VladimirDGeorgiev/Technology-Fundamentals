package MapsLambdaandStreamAPI;

        import javax.security.sasl.SaslClient;
        import java.util.*;

public class LabCountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double,Integer> count = new TreeMap<>();

        for (int i = 0; i <numbers.length ; i++) {
            count.putIfAbsent(numbers[i],0);
            count.put(numbers[i],count.get(numbers[i])+1);
        }
        for (Map.Entry<Double,Integer> j: count.entrySet()
        ) {
            System.out.println(String.format("%.0f -> %d",j.getKey(),j.getValue()));

        }
    }
}
