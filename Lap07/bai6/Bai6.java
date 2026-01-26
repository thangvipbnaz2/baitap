package Lap07.bai6;

public class Bai6 {
    String deviceName;
    double power;

    public Bai6(String name, double power) {
        deviceName = name;
        this.power = power;
    }

    public double powerConsumption() {
        return power;
    }

    public void showPower() {
        System.out.println(deviceName + " tiêu thụ: " + powerConsumption() + " W");
    }

    public static void main(String[] args) {
        Bai6 laptop = new Bai6("Laptop", 65);
        Bai6 air = new Bai6("Máy lạnh", 1500);
        Bai6 tv = new Bai6("TV", 120);

        laptop.showPower();
        air.showPower();
        tv.showPower();
    }
}
