package Lap08.Bai8;

public class Main {
    public static void paySalary(Payable p) {
        System.out.println("Salary: " + p.calculateSalary());
    }

    public static void main(String[] args) {
        paySalary(new FullTimeEmployee());
        paySalary(new PartTimeEmployee());
        paySalary(new Contractor());
    }
}
