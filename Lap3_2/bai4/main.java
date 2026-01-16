package Lap3_2.bai4;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.input();
        System.out.println("Diện tích: " + c.getArea());
        System.out.println("Chu vi: " + c.getPerimeter());

        if (c.isBigCircle()) {
            System.out.println("Hình tròn lớn");
        } else {
            System.out.println("Hình tròn nhỏ");
        }
    }
}
