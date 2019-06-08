package JavaAdvance.DefiningClasses.Exercises.p04RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");
            cars.add(new Car(data[0]
                    ,Integer.parseInt(data[1])
                    ,Integer.parseInt(data[2])
                    ,Integer.parseInt(data[3])
                    ,data[4]
                    ,Double.parseDouble(data[5]),Integer.parseInt(data[6])
                    ,Double.parseDouble(data[7]),Integer.parseInt(data[8])
                    ,Double.parseDouble(data[9]),Integer.parseInt(data[10])
                    ,Double.parseDouble(data[11]),Integer.parseInt(data[12])

            ));
        }
        String command = reader.readLine();
        if (command.equals("fragile")){
            for (Car car : cars) {
               if(car.getCargo().getType().equals("fragile")){
                   for (Tire tire : car.getTires()) {
                       if(tire.getPressure()<1){
                           System.out.println(car.getModel());
                           break;
                       }
                   }
                }
            }
        }else if (command.equals("flamable")){
            for (Car car : cars) {
                if(car.getCargo().getType().equals("flamable")&&car.getEngine().getPower()>250){
                    System.out.println(car.getModel());
                }
            }
        }
    }
}
