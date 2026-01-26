package Lap07.bai1;

public class bai1 {
    String name;
    double width;
    double height;
    double radius;

    // Constructor hình chữ nhật
    public bai1(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.radius = 0;
    }

    // Constructor hình tròn
    public bai1(String name, double radius) {
        this.name = name;
        this.radius = radius;
        this.width = 0;
        this.height = 0;
    }

    public double area() {
        if (radius > 0) {
            return Math.PI * radius * radius;
        }
        return width * height;
    }

    public void display() {
        System.out.println(name + " - Diện tích: " + area());
    }

    public static void main(String[] args) {
        bai1 hcn1 = new bai1("Hình chữ nhật 1", 4, 5);
        bai1 hcn2 = new bai1("Hình chữ nhật 2", 3, 6);
        bai1 ht = new bai1("Hình tròn", 3);

        hcn1.display();
        hcn2.display();
        ht.display();
    }
}
