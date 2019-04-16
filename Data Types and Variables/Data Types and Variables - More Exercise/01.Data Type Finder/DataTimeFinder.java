import java.util.Scanner;

public class DataTimeFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("END")) {

            //Char or single int type
            if (command.length() == 1) {
                char typeChar = command.charAt(0);
                if (typeChar >= 45 && typeChar <= 57) {
                    System.out.printf("%s is integer type%n", command);
                } else {
                    System.out.printf("%s is character type%n", command);
                }
            } else {
                //Boolean type
                if (command.toLowerCase().equals("true") || command.toLowerCase().equals("false")) {
                    System.out.printf("%s is boolean type%n", command);

                } else {
                    boolean typeString =false;
                    boolean typeDott = false;


                    for (int i = 0; i < command.length(); i++) {

                        char a = command.charAt(i);

                        if ((int) a < 45 || a > 57) {
                        //String type
                            typeString = true;
                        }
                        //Double type
                        if (a == 46) {
                            typeDott = true;
                        }


                    }

                    if (typeString) {
                        System.out.printf("%s is string type%n", command);

                    } else {
                        if (typeDott) {
                            System.out.printf("%s is floating point type%n", command);
                        } else {
                            System.out.printf("%s is integer type%n", command);
                        }
                    }

                }

            }
            command = scanner.nextLine();
        }

    }
}
