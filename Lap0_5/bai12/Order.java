package Lap0_5.bai12;

public class Order {
    String orderId;
    Product product;


    double getTotal() {
        return product.price;
    }
}
