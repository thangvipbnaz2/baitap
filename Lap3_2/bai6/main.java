package Lap3_2.bai6;

public class main {
    public static void main(String[] args) {
        Product p = new Product();

        p.input();
        p.display();

        System.out.println("Tổng tiền: " + p.getTotalPrice());

        p.discount(10);
        p.display();
    }
}
