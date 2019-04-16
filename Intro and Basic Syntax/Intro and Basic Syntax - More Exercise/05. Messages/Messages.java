import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int command = Integer.parseInt(scanner.nextLine());
        String leather = "";
        for (int i = 1; i <= command; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            switch (num) {
                case 2:leather+="a";break;
                case 22:leather+="b";break;
                case 222:leather+="c";break;
                case 3:leather+="d";break;
                case 33:leather+="e";break;
                case 333:leather+="f";break;
                case 4:leather+="g";break;
                case 44:leather+="h";break;
                case 444:leather+="i";break;
                case 5:leather+="j";break;
                case 55:leather+="k";break;
                case 555:leather+="l";break;
                case 6:leather+="m";break;
                case 66:leather+="n";break;
                case 666:leather+="o";break;
                case 7:leather+="p";break;
                case 77:leather+="q";break;
                case 777:leather+="r";break;
                case 7777:leather+="s";break;
                case 8:leather+="t";break;
                case 88:leather+="u";break;
                case 888:leather+="v";break;
                case 9:leather+="w";break;
                case 99:leather+="x";break;
                case 999:leather+="y";break;
                case 9999:leather+="z";break;
                case 0:leather+=" ";break;

                default:
                    break;
            }

        }
        System.out.println(leather);

    }
}
