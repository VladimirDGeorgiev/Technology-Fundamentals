package JavaAdvance.DefiningClasses.Exercises.p07Google;

public class Company {
    private String companyName;
    private String department;
    private double salary;


    public Company(String companyName,String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }
}
