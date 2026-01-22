package Lap0_5.bai14;

public class Employee {
    String id;
    String name;
    double salary;
    Department department; // HAS-A

    void display() {
        System.out.println("Nhân viên: " + id + " - " + name);
        System.out.println("Lương: " + salary);
        department.display();
    }
}
