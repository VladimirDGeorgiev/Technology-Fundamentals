package JavaAdvance.DefiningClasses.Exercises.p02CompanyRoster;

public class Employee {
    private String name;
    private double salary;
    private String position;
    private String email = "n/a";
    private int age=-1;

    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public Employee(String name, double salary, String position, String email) {
        this(name,salary,position);
        this.email = email;
    }
    public Employee(String name, double salary, String position, int age) {
        this(name,salary,position);
        this.age = age;
    }

    public Employee(String name, double salary, String position, String email, int age) {
        this(name,salary,position,email);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public int getAge() {
        return age;
    }


    public double getSalary() {
        return salary;
    }
}
