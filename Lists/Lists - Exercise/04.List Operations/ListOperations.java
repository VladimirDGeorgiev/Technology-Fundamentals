package ListExer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine().toLowerCase();
        while (!command.equals("end")){
            String[] arr = command.split("\\s+");
            int index1 = 0;
            int index2 = 0;
            switch (arr[0]){
                case "add":
                    index1 =Integer.parseInt(arr[1]);
                    list.add(index1);
                    break;

                case "insert":
                    index1 =Integer.parseInt(arr[1]);
                    index2 =Integer.parseInt(arr[2]);
                    if (index2>=0&&index2<list.size()){
                    list.add(index2,index1);
                }else{
                    System.out.println("Invalid index");
                }
                    break;

                case "remove":
                    index1 =Integer.parseInt(arr[1]);
                    if (index1>=0&&index1<list.size()){
                        list.remove(index1);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;

                case "shift":
                    String leftOrRight = arr[1];
                    int count =Integer.parseInt(arr[2]);
                    if (list.size()>0) {
                        if (leftOrRight.equals("left")) {
                            for (int i = 0; i <count%list.size() ; i++) {
                                list.add(list.get(0));
                                list.remove(0);
                            }

                        } else {
                            for (int i = 0; i <count%list.size() ; i++) {
                            list.add(0,list.get(list.size()-1));
                            list.remove(list.size()-1);
                        }

                        }
                    }
                    break;

                default:
                    break;

            }


            command = scanner.nextLine().toLowerCase();
        }
        System.out.println(list.toString().replaceAll("\\[|,|\\]", ""));
    }

}
