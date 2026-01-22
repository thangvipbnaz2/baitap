package Lap0_5.bai13;

public class MainBai13 {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.id = "KH01";
        c.name = "Nguyen Van A";

        Invoice i = new Invoice();
        i.invoiceId = "HD01";
        i.amount = 5000000;
        i.customer = c;

        i.display();
    }
}
