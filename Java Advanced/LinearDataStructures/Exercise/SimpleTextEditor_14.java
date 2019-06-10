package LinearDataStructures.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String result = "";
        ArrayDeque<Commands> commands = new ArrayDeque<>();

        for (int i = 0; i <n ; i++) {
            String[] data = scanner.nextLine().split(" ");
            int command = Integer.parseInt(data[0]);
            String argument="";
            if (data.length>1) {
                argument = data[1];
            }
            if (command==1){
                commands.push(new Commands(command,argument));
            }else if (command==2){
                commands.push(new Commands(command,result.substring(result.length()-Integer.parseInt(argument))));
            }
            if (command==1){
                result+=argument;
            }else if (command==2){
                result=result.substring(0,result.length()-Integer.parseInt(argument));
            }else if (command==3){
                System.out.println(result.charAt(Integer.parseInt(argument)-1));
            }else if (command==4){
                assert commands.peek() != null;
                int lastCommand = commands.peek().getKey();
                assert commands.peek() != null;
                String lastArgument = commands.peek().getArgument();
                commands.pop();
                if (lastCommand==1){
                    result=result.substring(0,result.length()-lastArgument.length());
                }else if (lastCommand==2){
                    result +=lastArgument;
                }
            }

        }
    }

}
class Commands {
    private int key;
    private String argument;



    public  Commands(int key, String argument) {
        this.key = key;
        this.argument = argument;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }
}
