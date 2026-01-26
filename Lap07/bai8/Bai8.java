package Lap07.bai8;

public class Bai8 {
    String type;
    double a, b;

    public Bai8(String type, double a, double b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        if (type.equals("Rectangle"))
            return a * b;
        if (type.equals("Square"))
            return a * a;
        return Math.PI * a * a;
    }

    public double getPerimeter() {
        if (type.equals("Rectangle"))
            return 2 * (a + b);
        if (type.equals("Square"))
            return 4 * a;
        return 2 * Math.PI * a;
    }

    public void show() {
        System.out.println(type +
                " | Diện tích: " + getArea() +
                " | Chu vi: " + getPerimeter());
    }

    public static void main(String[] args) {
        Bai8 r = new Bai8("Rectangle", 4, 5);
        Bai8 s = new Bai8("Square", 4, 0);
        Bai8 c = new Bai8("Circle", 3, 0);

        r.show();
        s.show();
        c.show();
    }
}
