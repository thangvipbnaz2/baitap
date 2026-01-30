package Lap09.Bai4;

public class SameDayShipping extends ShippingService {
    public SameDayShipping(double d, double w) {
        super(d, w);
    }

    @Override
    public double calculateFee() {
        return distance * 12 + weight * 5;
    }
}
