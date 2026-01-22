package Lap0_5.bai14;

public class MainBai14 {
    public static void main(String[] args) {
        Department d = new Department();
        d.deptId = "IT";
        d.deptName = "Cong nghe thong tin";

        Employee e = new Employee();
        e.id = "NV01";
        e.name = "Tran Van B";
        e.salary = 15000000;
        e.department = d;

        e.display();
    }
}
