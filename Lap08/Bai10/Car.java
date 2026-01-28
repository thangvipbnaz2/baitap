package Lap08.Bai10;

public class Car implements Movable, FuelConsumable {
    public void move() {
        System.out.println("Car moving");
    }

    public double getFuelConsumption() {
        return 8.5;
    }
}
