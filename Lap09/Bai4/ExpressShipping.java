package Lap09.Bai4;

public class ExpressShipping extends ShippingService {
    public ExpressShipping(double d, double w) {
        super(d, w);
    }

    @Override
    public double calculateFee() {
        return distance * 8 + weight * 3;
    }
}

