package Lap3_1.bai7;

public class main {
    public static void main(String[] args) {
        bai7 b7 = new bai7();
        b7.accelerate(120);
        b7.displayStatus();
        System.out.println(b7.isOverSpeed() ? "Quá tốc độ" : "Bình thường");
    }
}
