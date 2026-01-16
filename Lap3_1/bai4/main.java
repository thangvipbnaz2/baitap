package Lap3_1.bai4;

public class main {
    public static void main(String[] args) {
        bai4 b4 = new bai4();
        b4.input();
        System.out.println("Area: " + b4.getArea());
        System.out.println("Perimeter: " + b4.getPerimeter());
        System.out.println(b4.isBigCircle() ? "Hình tròn lớn" : "Hình tròn nhỏ");
    }
}
