package Lap04.bai9;

public class CPU {
    String brand;
    double speed;


    public CPU(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
class Computer {
    String model;
    CPU cpu;


    public Computer(String model, CPU cpu) {
        this.model = model;
        this.cpu = cpu;
    }


    public void displayInfo() {
        System.out.println(model + " - " + cpu.brand + " - " + cpu.speed + "GHz");
    }
}
