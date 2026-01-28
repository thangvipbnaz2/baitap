package Lap08.Bai3;

public interface Vehicle {
    void start();

    default void honk() {
        System.out.println("Beep beep!");
    }
}
