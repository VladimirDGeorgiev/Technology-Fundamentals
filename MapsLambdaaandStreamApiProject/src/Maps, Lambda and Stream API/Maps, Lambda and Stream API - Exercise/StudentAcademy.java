package HashMapsandStream.Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> input = new LinkedHashMap<>();

        for (int i = 0; i <n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            input.putIfAbsent(name,new ArrayList<>());
            input.get(name).add(grade);
        }
        Map<String,Double> result = new LinkedHashMap<>();
        for (var j:input.entrySet()) {
            double sum = 0;
            int count = 0;
            for (var k:j.getValue()) {
                sum+=k;
                count++;
            }
            sum = sum/count;
            if (sum>=4.5) {
                result.put(j.getKey(), sum);
            }
        }
        result.entrySet().stream().sorted((a,b)->b.getValue().
                compareTo(a.getValue())).forEach(e-> System.out.println(String.format("%s -> %.2f",e.getKey(),e.getValue())));
    }
}
