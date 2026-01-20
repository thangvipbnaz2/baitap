package Lap04.bai8;

public class Employee2 {
    String id;
    String name;
}
class Department {
    String deptName;
    Employee2 employee;


    public void display() {
        System.out.println(deptName + " - " + employee.id + " - " + employee.name);
    }
}
