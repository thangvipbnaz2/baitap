package Lap0_5.bai15;

public class MainBai15 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Le Thi C";
        t.degree = "Thac si";

        ClassRoom c = new ClassRoom();
        c.className = "Java OOP";
        c.teacher = t;

        Student s = new Student();
        s.name = "Nguyen Van D";
        s.classRoom = c;

        s.display();
    }
}
