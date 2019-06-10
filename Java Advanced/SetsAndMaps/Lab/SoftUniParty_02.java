package SetsAndMaps.Lab;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> vipGuests = new HashSet<>();
        TreeSet<String> normalGuests = new TreeSet<>();
        while (true){
            String data = scanner.nextLine();
            if (data.equals("PARTY")){
                while (true){
                    data= scanner.nextLine();
                    if (data.equals("END")){
                        System.out.println(vipGuests.size()+normalGuests.size());
                        if (!vipGuests.isEmpty()) {
                            for (String vipGuest : vipGuests) {
                                System.out.println(vipGuest);
                            }
                        }
                        if (!normalGuests.isEmpty()){
                            for (String normalGuest : normalGuests) {
                                System.out.println(normalGuest);
                            }
                        }
                        return;
                    }
                    vipGuests.remove(data);
                    normalGuests.remove(data);
                }
            }
            if (data.length()==8) {
                if (Character.isDigit(data.charAt(0))) {
                    vipGuests.add(data);
                } else {
                    normalGuests.add(data);
                }
            }
        }
    }
}
