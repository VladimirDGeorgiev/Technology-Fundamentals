package ListExer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String command = scanner.nextLine();
            String[] arr = command.split("\\s+");
            if (command.contains("not")){
                boolean isthere = isItThere(guestList, arr[0]);
                if (isthere){

                    guestList.remove(arr[0]);
                }else {

                    System.out.println(String.format( "%s is not in the list!",arr[0]));
                }

            }else{                                  //is going
                boolean isthere = isItThere(guestList, arr[0]);
                if (isthere){
                    System.out.println(String.format( "%s is already in the list!",arr[0]));

                }else {
                    guestList.add(arr[0]);
                }
            }



        }
        for (String i:guestList) {
            System.out.println(i);
        }
    }

    public static boolean isItThere(List<String> guestList, String s) {
        boolean isthere = false;

        for (int j = 0; j < guestList.size(); j++) {
            if (s.equals(guestList.get(j))) {
                isthere = true;
                break;
            }
        }
        return isthere;
    }
}
