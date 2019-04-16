package Objectandclass.Students;

import java.util.List;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private String city;

    public Student(String firstname,String lastname,int age,String city){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
