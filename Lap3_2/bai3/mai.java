package Lap3_2.bai3;

public class mai {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.input();
        emp.display();
        double tax = emp.calculateTax();
        System.out.print("Thuế Phải Đóng:"+tax);
        if(tax == 0){
            System.out.print("Không Phải Đóng Thuế!");
        }
    }
}
