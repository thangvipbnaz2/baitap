package Lap3_2.bai7;

public class main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 60);

        car.accelerate(50);
        car.brake(20);
        car.displayStatus();

        if (car.isOverSpeed()) {
            System.out.println("Xe đang vượt quá tốc độ cho phép");
        }
    }
}
