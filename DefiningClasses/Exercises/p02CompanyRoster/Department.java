package JavaAdvance.DefiningClasses.Exercises.p02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String department;
    private List<Employee> list;
    private double averageSalary;

    public Department() {
        this.list = new ArrayList<>();
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(Employee list) {
        this.list.add(list);
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary += averageSalary;
    }
}
