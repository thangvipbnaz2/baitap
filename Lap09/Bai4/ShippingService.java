package Lap09.Bai4;

public class ShippingService {
    protected double distance;
    protected double weight;

    public ShippingService(double distance, double weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public double calculateFee() {
        return 0;
    }
}

