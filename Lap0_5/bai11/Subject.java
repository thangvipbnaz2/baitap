package Lap0_5.bai11;

public class Subject {
    String subjectName;
    Teacher teacher;


    void display() {
        System.out.println("Môn: " + subjectName);
        teacher.display();
    }
}
