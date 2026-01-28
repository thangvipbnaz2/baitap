package Lap08.Bai10;

public class Bicycle implements Movable {
    public void move() {
        System.out.println("Bicycle moving");
    }

    @Override
    public void stop() {
        System.out.println("Using brakes");
    }
}
