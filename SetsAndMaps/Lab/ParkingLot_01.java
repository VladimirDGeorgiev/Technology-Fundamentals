package SetsAndMaps.Lab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        HashSet<String> parkingRegister = new HashSet<>();

        while (!command.equalsIgnoreCase("end")){
            String[] data = command.split(", ");
            String direction = data[0];
            String carNumber = data[1];
        if (direction.equals("IN")){
            parkingRegister.add(carNumber);
        }else{
            parkingRegister.remove(carNumber);
        }
            command = scanner.nextLine();
        }
        if (parkingRegister.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String s : parkingRegister) {
                System.out.println(s);
            }
        }
    }
}
