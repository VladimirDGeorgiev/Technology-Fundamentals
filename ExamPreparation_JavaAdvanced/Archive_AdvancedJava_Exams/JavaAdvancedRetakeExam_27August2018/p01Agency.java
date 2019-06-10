package ExamPreparation_JavaAdvanced.Archive_AdvancedJava_Exams.JavaAdvancedRetakeExam_27August2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p01Agency {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] idData = reader.readLine().split("\\s+");
        ArrayDeque<String> stackOfId = new ArrayDeque<>();
        for (String id : idData) {
            stackOfId.push(id);
        }
        String[] nameData = reader.readLine().split("\\s+");
        ArrayDeque<String> queueNames = new ArrayDeque<>();
        for (String name : nameData) {
            queueNames.offer(name);
        }
        String command;

        while (!(command = reader.readLine()).equals("stop")) {
            String[] commandData = command.split("\\s+");

            switch (commandData[0]) {
                case "add-ID":
                    stackOfId.push(commandData[1]);
                    break;
                case "add-agent":
                    queueNames.offer(commandData[1]);
                    break;
                case "remove-ID":
                    if (!stackOfId.isEmpty())
                        System.out.printf("%s has been removed.%n", stackOfId.pop());
                    break;
                case "remove-agent":
                    if (!queueNames.isEmpty())
                        System.out.printf("%s has left the queue.%n", queueNames.pollLast());
                    break;
                case "sort-ID":
                    List<String> reversList = stackOfId.stream().sorted().collect(Collectors.toList());
                    stackOfId.clear();
                    for (String e : reversList) {
                        stackOfId.push(e);
                    }
                    break;
                default:
                    break;
            }
        }
        while (!stackOfId.isEmpty() && !queueNames.isEmpty()) {
            String id = stackOfId.pop();
            String name = queueNames.poll();
            System.out.printf("%s takes ID number: %s%n", name, id);
        }
        if (queueNames.isEmpty()&&!stackOfId.isEmpty()) {
            System.out.println("No more agents left.");
            while (!stackOfId.isEmpty()) {
                System.out.println("ID number: " + stackOfId.pop());
            }
        }
        if (stackOfId.isEmpty()&&!queueNames.isEmpty()) {
            while (!queueNames.isEmpty()) {
                System.out.println(queueNames.poll() + " does not have an ID.");
            }
        }



    }
}
