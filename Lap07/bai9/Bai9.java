package Lap07.bai9;

public class Bai9 {
    String name;
    double costPerKm;
    int capacity;

    public Bai9(String name, double cost, int cap) {
        this.name = name;
        costPerKm = cost;
        capacity = cap;
    }

    public double calculateCost(double distance) {
        return distance * costPerKm;
    }

    public int getCapacity() {
        return capacity;
    }

    public void showInfo(double distance) {
        System.out.println(name +
                " | Chi phí: " + calculateCost(distance) +
                " | Sức chứa: " + getCapacity());
    }

    public static void main(String[] args) {
        double distance = 10;

        Bai9 bus = new Bai9("Bus", 5000, 40);
        Bai9 taxi = new Bai9("Taxi", 12000, 4);
        Bai9 train = new Bai9("Train", 4000, 200);

        bus.showInfo(distance);
        taxi.showInfo(distance);
        train.showInfo(distance);
    }
}
