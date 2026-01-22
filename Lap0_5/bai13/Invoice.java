package Lap0_5.bai13;

public class Invoice {
    String invoiceId;
    double amount;
    Customer customer; // HAS-A

    void display() {
        System.out.println("Hóa đơn: " + invoiceId);
        System.out.println("Số tiền: " + amount);
        customer.display();
    }
}
