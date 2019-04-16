import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        String[] indexesOfLadybugs = scanner.nextLine().split(" ");//input data array
        int[] temp = new int[indexesOfLadybugs.length];                 // temp array to int
        for (int i = 0; i <temp.length ; i++) {
            temp[i]=Integer.parseInt(indexesOfLadybugs[i]);
        }
        int[] newArr = new int[size];
        for (int i = 0; i <temp.length ; i++) {                       // array of ladybugs with 1 and 0
            if (temp[i]>=0&&temp[i]<newArr.length) {                      // range check!!!
                newArr[temp[i]] = 1;
            }


        }
       String commandEnd = scanner.next();                              //commanda End

        while (!commandEnd.equals("end")){
            int indexPoint = Integer.parseInt(commandEnd);              // 0(indexPoint) right 2(flyLenght)
            String direction = scanner.next();
            int flyLenght = Integer.parseInt(scanner.next());

            if (indexPoint>=0&&indexPoint<=newArr.length-1&&newArr[indexPoint]==1) {
                newArr[indexPoint]=0;
                if (direction.equals("right")) {

                    for (int i = indexPoint + flyLenght; i < newArr.length; i = i + flyLenght) {//i++???
                        if (newArr[i] == 0) {
                            newArr[i] = 1;
                            break;
                        }

                    }
                }
                if (direction.equals("left")) {
                    for (int i = indexPoint - flyLenght; i >= 0; i = i - flyLenght) {//i--????
                        if (newArr[i] == 0) {
                            newArr[i] = 1;
                            break;
                        }
                    }
                }
            }


            commandEnd = scanner.next();
        }
        for (int i:newArr) {
            System.out.print(i+" ");
        }

    }
}
