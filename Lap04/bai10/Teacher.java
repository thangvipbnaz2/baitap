package Lap04.bai10;

public class Teacher {
    private String name;
    private String specialization;


    public Teacher(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }


    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
}
class ClassRoom {
    private String className;
    private Teacher teacher;


    public ClassRoom(String className) {
        this.className = className;
    }


    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }


    public void display() {
        System.out.println(className + " - " + teacher.getName() + " - " + teacher.getSpecialization());
    }
}
