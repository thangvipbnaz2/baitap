package Lap0_5.bai15;

public class Student {
    String name;
    ClassRoom classRoom; // HAS-A

    void display() {
        System.out.println("Sinh viên: " + name);
        System.out.println("Lớp: " + classRoom.className);
        classRoom.teacher.display();
    }
}
