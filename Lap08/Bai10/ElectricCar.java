package Lap08.Bai10;

public class ElectricCar implements Movable, FuelConsumable, ElectricChargeable {
    public void move() {
        System.out.println("Electric car moving");
    }

    public double getFuelConsumption() {
        return 0;
    }

    public void charge() {
        System.out.println("Charging electric car");
    }
}
