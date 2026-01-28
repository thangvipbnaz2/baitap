package Lap08.Bai10;

public interface Movable {
    void move();

    default void stop() {
        System.out.println("Stopping");
    }
}
