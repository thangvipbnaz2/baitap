package Lap0_5.bai2;

public class Employee {
    String id, name;
    MyDate birthDate;

    public Employee(String id, String name, MyDate bd) {
        this.id = id;
        this.name = name;
        birthDate = bd;
    }

    void display() {
        System.out.println(id + " - " + name);
        birthDate.display();
    }
}
