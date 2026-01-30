package Lap09.Bai4;

public class StandardShipping extends ShippingService {
    public StandardShipping(double d, double w) {
        super(d, w);
    }

    @Override
    public double calculateFee() {
        return distance * 5 + weight * 2;
    }
}
