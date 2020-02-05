package JavaAdvance.DefiningClasses.Lab.p01CarInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInput = Integer.parseInt(reader.readLine());
        List<Car> listCars = new ArrayList<>();
        int count = 0;
        while (numberOfInput-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            listCars.add(new Car());
            listCars.get(count).setMake(data[0]);
            listCars.get(count).setModel(data[1]);
            listCars.get(count).setHorsePower(Integer.parseInt(data[2]));

            count++;
        }
        for (Car car : listCars) {
            System.out.println(car.getInfo());
        }
    }
}
