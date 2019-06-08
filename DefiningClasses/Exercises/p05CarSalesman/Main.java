package JavaAdvance.DefiningClasses.Exercises.p05CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Engine> engineList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] engineData = reader.readLine().split("\\s+");
            if (engineData.length == 2) {
                engineList.add(new Engine(engineData[0], Integer.parseInt(engineData[1])));
            } else if (engineData.length == 4) {
                engineList.add(new Engine(engineData[0], Integer.parseInt(engineData[1])
                        , Integer.parseInt(engineData[2]), engineData[3]));
            } else {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    engineList.add(new Engine(engineData[0], Integer.parseInt(engineData[1])
                            , Integer.parseInt(engineData[2])));
                } else {
                    engineList.add(new Engine(engineData[0], Integer.parseInt(engineData[1])
                            , engineData[2]));
                }
            }
        }

        int m = Integer.parseInt(reader.readLine());
        List<Car> carList = new ArrayList<>();

        for (int c = 0; c < m; c++) {
            String[] carData = reader.readLine().split("\\s+");
            if (carData.length == 2) {
                carList.add(new Car(carData[0], searchEngine(carData[1], engineList)));
            } else if (carData.length == 4) {
                carList.add(new Car(carData[0], searchEngine(carData[1], engineList)
                        ,Integer.parseInt(carData[2]),carData[3]));
            } else {
                if (Character.isDigit(carData[2].charAt(0))) {
                    carList.add(new Car(carData[0], searchEngine(carData[1], engineList)
                            ,Integer.parseInt(carData[2])));
                } else {
                    carList.add(new Car(carData[0], searchEngine(carData[1], engineList)
                            ,carData[2]));
                }
            }
        }
        for (Car car : carList) {
            car.ToString();
        }
    }

    private static Engine searchEngine(String engine, List<Engine> engineList) {
        for (Engine e : engineList) {
            if (e.getModel().equals(engine)) {
                return e;
            }
        }
        return null;
    }
}
