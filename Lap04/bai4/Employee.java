package Lap04.bai4;

public class Employee {
    private String id;
    private String name;
    private double salary;


    public Employee(String name) {
        this.name = name;
        this.salary = 0;
    }


    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary < 0 ? 0 : salary;
    }


    public void display() {
        System.out.println(id + " - " + name + " - " + salary);
    }
}
