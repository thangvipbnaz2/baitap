package Lap0_5.bai5;

public class Car {
    String brand, color;
    Engine engine;


    void display() {
        System.out.println("Xe: " + brand + " - Màu: " + color);
        engine.display();
    }
}
