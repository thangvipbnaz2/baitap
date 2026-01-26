package Lap07.bai2;

public class Bai2 {
    String id;
    String name;
    double salary;

    public Bai2(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }

    public void showInfo() {
        System.out.println("ID: " + id + " | Name: " + name + " | Lương: " + calculateSalary());
    }

    public static void main(String[] args) {
        Bai2 fullTime = new Bai2("E01", "An", 10000000);
        Bai2 partTime = new Bai2("E02", "Bình", 4000000);

        fullTime.showInfo();
        partTime.showInfo();
    }
}
