package Objectandclass.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> catalogue = new ArrayList<>();

        while (!input.equals("End")){
            String[] command = input.split("\\s+");
            String type = command[0];
            String model = command[1];
            String color = command[2];
            int power = Integer.parseInt(command[3]);
            catalogue.add(new Vehicle(type,model,color,power));
            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")){
            for (Vehicle i:catalogue) {
                if (i.getModel().equals(model)){
                    System.out.println(i.toString());
                }
            }
            model = scanner.nextLine();
        }
        double sumTrucks = 0;
        double sumCars =0;
        int countTrucks=0;
        int countCars=0;

        for (Vehicle i:catalogue) {
            if (i.getType().equals("truck")){
                sumTrucks+=i.getHorsePower();
                countTrucks++;
            }else if(i.getType().equals("car")){
                sumCars+=i.getHorsePower();
                countCars++;
            }
        }
        if (countCars==0){
            sumCars=0;
        }else {
            sumCars = sumCars / countCars;
        }
        if (countTrucks==0){
            sumTrucks=0;
        }else{
            sumTrucks=sumTrucks/countTrucks;
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.",sumCars));
        System.out.println(String.format("Trucks have average horsepower of: %.2f.",sumTrucks));

    }
}
