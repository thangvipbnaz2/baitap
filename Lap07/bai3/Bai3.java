package Lap07.bai3;

public class Bai3 {
    String brand;
    int maxSpeed;

    public Bai3(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void showInfo() {
        System.out.println("Hãng: " + brand + " - Tốc độ tối đa: " + getMaxSpeed());
    }

    public static void main(String[] args) {
        Bai3 car = new Bai3("Toyota", 180);
        Bai3 bike = new Bai3("Honda", 120);

        car.showInfo();
        bike.showInfo();
    }
}
