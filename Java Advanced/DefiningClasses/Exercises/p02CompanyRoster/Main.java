package JavaAdvance.DefiningClasses.Exercises.p02CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Map<String, Department> departmentMap = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            if (data.length == 5) {
                if (Character.isDigit(data[4].charAt(0))) {
                    int age = Integer.parseInt(data[4]);
                    departmentMap.putIfAbsent(department, new Department());
                    departmentMap.get(department).setList(new Employee(name, salary, position, age));
                    departmentMap.get(department).setAverageSalary(salary);
                } else {
                    String email = data[4];
                    departmentMap.putIfAbsent(department, new Department());
                    departmentMap.get(department).setList(new Employee(name, salary, position, email));
                    departmentMap.get(department).setAverageSalary(salary);
                }

            } else if (data.length == 6) {
                String email = data[4];
                int age = Integer.parseInt(data[5]);
                departmentMap.putIfAbsent(department, new Department());
                departmentMap.get(department).setList(new Employee(name, salary, position, email, age));
                departmentMap.get(department).setAverageSalary(salary);
            } else {
                departmentMap.putIfAbsent(department, new Department());
                departmentMap.get(department).setList(new Employee(name, salary, position));
                departmentMap.get(department).setAverageSalary(salary);


            }
        }
        //find highest averige salary and the departmand
        double averageSalary = Double.MIN_VALUE;
        String department = "";
        for (Map.Entry<String, Department> element : departmentMap.entrySet()) {
            double average = element.getValue().getAverageSalary() / element.getValue().getList().size();
            if (average > averageSalary) {
                averageSalary = average;
                department = element.getKey();
            }
        }
        //Sort the list in  descending order
        departmentMap.get(department).getList().sort((a, b) -> Double.compare(b.getSalary(), a.getSalary()));
        // Print department with the highest average salary
        System.out.println("Highest Average Salary: " + department);
        //Print empoyee in the departmant
        for (Employee employee : departmentMap.get(department).getList()) {
            System.out.printf("%s %.2f %s %d%n"
                    ,employee.getName()
                    ,employee.getSalary()
                    ,employee.getEmail()
                    ,employee.getAge());
        }
    }
}
