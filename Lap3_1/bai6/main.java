package Lap3_1.bai6;

public class main {
    public static void main(String[] args) {
        bai6 b6 = new bai6();
        b6.input();
        b6.discount(10);
        b6.display();
        System.out.println("Total: " + b6.getTotalPrice());
    }
}
