package Lap08.Bai10;

public class Main {
    public static void main(String[] args) {
        Movable[] vehicles = {
                new Car(),
                new Bicycle(),
                new ElectricCar()
        };

        for (Movable v : vehicles) {
            v.move();
            v.stop();
        }
    }
}
