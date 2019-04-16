import java.lang.reflect.Array;
import java.util.*;

public class ArrayManipulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] temp = scanner.nextLine().split(" ");
        int[] arr = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        String commands = scanner.nextLine().toLowerCase();

        while (!commands.equals("end")) {
            int value = stringToInt(stripNonDigits(commands));
            if (commands.contains("exchange")) {
                if (value > arr.length - 1) {
                    System.out.println("Invalid index");
                } else {
                    rotaionOfArr(arr, value);
                }
            } else if (commands.contains("max even")) {
                maxEven(arr);
            } else if (commands.contains("max odd")) {
                maxOdd(arr);
            } else if (commands.contains("min even")) {
                minEven(arr);
            } else if (commands.contains("min odd")) {
                minOdd(arr);

            } else if (commands.contains("first") && commands.contains("even")) {
                firstEven(arr, value);
            } else if (commands.contains("first") && commands.contains("odd")) {
                firstOdd(arr, value);
            } else if (commands.contains("last")&&commands.contains("even")) {
                lastEven(arr,value);
            } else if (commands.contains("last")&&commands.contains("odd")) {
                lastOdd(arr,value);
            }


            commands = scanner.nextLine();
        }
        String endString = "[";
        for (int i = 0; i < arr.length; i++) {
                endString += arr[i];
                if (i == arr.length-1) {

                    break;
                }
                endString += ", ";


        }
        endString += "]";
        System.out.println(endString);

    }

    public static void firstEven(int[] arr, int value) {
        String output = "";
        if (value > arr.length - 1) {
            System.out.println("Invalid count");
        } else {
            output += "[";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    output += arr[i];
                    value--;
                    if (value == 0) {

                        break;
                    }
                    output += ", ";
                }

            }
            output += "]";
            System.out.println(output);
        }
    }

    public static void lastEven(int[] arr, int value) {
        String output = "";
        int[] tempArr = new int[arr.length];
        int indexOfTempArr = 0;
        int count = 0;
        if (value > arr.length ) {
            System.out.println("Invalid count");
        } else {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count++;
                    tempArr[indexOfTempArr++]=arr[i];
                }
            }

            if (count>value) {
                System.out.print("[");
                for (int i = count - value; i < count; i++) {
                    System.out.print(tempArr[i]);
                    if (i == count - 1) {

                        break;
                    }
                    System.out.print(", ");
                }
                System.out.printf("]%n");
            }
            else{
                System.out.print("[");
                for (int i = 0; i < count; i++) {
                System.out.print(tempArr[i]);
                if (i == count - 1) {

                    break;
                }
                    System.out.print(", ");
                }
                System.out.printf("]%n");

            }
        }
    }

    public static void firstOdd(int[] arr, int value) {
        String output = "[";
        int refer = value;
        if (value > arr.length - 1) {
            System.out.println("Invalid count");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    if (refer == value) {
                        output += arr[i];
                        value--;
                        if (value == 0 && arr.length - 1 == i) {

                            break;
                        }
                    } else {
                        output += ", " + arr[i];
                        value--;
                        if (value == 0 || arr.length - 1 == i) {

                            break;
                        }

                    }

                }

            }
            output += "]";
            System.out.println(output);
        }
    }
    public static void lastOdd(int[] arr, int value) {
        String output = "";
        int[] tempArr = new int[arr.length];
        int indexOfTempArr = 0;
        int count = 0;
        if (value > arr.length ) {
            System.out.println("Invalid count");
        } else {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                    tempArr[indexOfTempArr++]=arr[i];
                }
            }

            if (count>value) {
                System.out.print("[");
                for (int i = count - value; i < count; i++) {
                    System.out.print(tempArr[i]);
                    if (i == count - 1) {

                        break;
                    }
                    System.out.print(", ");
                }
                System.out.printf("]%n");
            }
            else{
                System.out.print("[");
                for (int i = 0; i < count; i++) {
                    System.out.print(tempArr[i]);
                    if (i == count - 1) {

                        break;
                    }
                    System.out.print(", ");
                }
                System.out.printf("]%n");

            }
        }
    }

    public static void minOdd(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min && arr[i] % 2 != 0) {
                min = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void maxOdd(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max && arr[i] % 2 != 0) {
                max = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void minEven(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= min && arr[i] % 2 == 0) {
                min = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void maxEven(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max && arr[i] % 2 == 0) {
                max = arr[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void rotaionOfArr(int[] arr, int value) {
        for (int j = 0; j < value + 1; j++) {
            int temporaly = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    temporaly = arr[0];
                }
                if (i == arr.length - 1) {
                    arr[i] = temporaly;
                } else {
                    arr[i] = arr[i + 1];
                }

            }
        }
    }

    public static String stripNonDigits(
            final CharSequence input /* inspired by seh's comment */) {
        final StringBuilder sb = new StringBuilder(
                input.length() /* also inspired by seh's comment */);
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static int stringToInt(String param) {
        try {
            return Integer.valueOf(param);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int[] reverse(int[] arr) {                        // НЕНУЖЕН МЕТОД огледален масив
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}

