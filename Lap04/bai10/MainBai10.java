package Lap04.bai10;

public class MainBai10 {
    public static void main(String[] args) {
        Teacher t = new Teacher("Thay Nam", "Java");
        ClassRoom c = new ClassRoom("OOP", t);
        c.display();
    }
}
