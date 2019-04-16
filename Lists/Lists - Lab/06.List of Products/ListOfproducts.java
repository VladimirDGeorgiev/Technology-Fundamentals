package ListExer;

import java.util.*;

public class ListOfproducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            productList.add(scanner.nextLine());
        }
        Collections.sort(productList);
        int j =1;
        for (String i : productList) {

            System.out.println((j++) + "" +i);
        }
    }
}
