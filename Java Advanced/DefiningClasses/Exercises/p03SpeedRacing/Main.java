package JavaAdvance.DefiningClasses.Exercises.p03SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            carList.add(new Car(data[0], Double.parseDouble(data[1]), Double.parseDouble(data[2])));
        }
        String command = "";

        while (!"End".equals(command = reader.readLine())) {
            String[] commandData = command.split("\\s+");
            String carModel = commandData[1];
            int amountOfKm = Integer.parseInt(commandData[2]);

            for (Car car : carList) {
                if (car.getModel().equals(carModel)) {
                    car.travel(amountOfKm);
                }
            }
        }
        for (Car car : carList) {
            System.out.println(String.format(
                    "%s %.2f %d",car.getModel()
                    ,car.getFuel()
                    ,car.getDistanceTraveled()
            ));
        }
    }
}
