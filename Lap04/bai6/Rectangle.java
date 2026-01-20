package Lap04.bai6;

public class Rectangle {
    private double width;
    private double height;


    public Rectangle() {
        this.width = this.height = 1;
    }


    public Rectangle(double side) {
        this.width = this.height = side;
    }


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }
}
