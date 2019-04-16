package Objectandclass.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static boolean IsStudentExisting(List<Student> students,String firstname,String lastname){
        for (Student student:students) {
            if (student.getFirstname().equals(firstname)&&student.getLastname().equals(lastname)){
                return true;
            }
        }
        return false;
    }
    private static Student getStudent(List<Student> students, String firstName,String lastName){
        Student existingStudent = null;
        for (Student student:students) {
            if (student.getFirstname().equals(firstName)&&student.getLastname().equals(lastName)){
                existingStudent=student;
            }
        }
        return existingStudent;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!input.equals("end")){
            String[] tokens = input.split("\\s+");
            if (IsStudentExisting(students,tokens[0],tokens[1])){
            Student student = getStudent(students,tokens[0],tokens[1]);

            }else{
            Student student = new Student(tokens[0],tokens[1],Integer.parseInt(tokens[2]),tokens[3]);
            students.add(student);}

            input=scanner.nextLine();
        }

        String city = scanner.nextLine();
        for (Student i:students) {
            if (i.getCity().equals(city)){
                System.out.println(String.format("%s %s is %s years old",i.getFirstname(),i.getLastname(),i.getAge()));
            }
        }
    }
}
