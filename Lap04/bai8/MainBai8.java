package Lap04.bai8;

public class MainBai8 {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.id = "E01";
        e.name = "Hoa";


        Department d = new Department();
        d.deptName = "IT";
        d.employee = e;
        d.display();
    }
}
