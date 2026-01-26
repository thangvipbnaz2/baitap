package Lap07.bai10;

public class Bai10 {
    String methodName;
    boolean success;

    public Bai10(String method, boolean success) {
        methodName = method;
        this.success = success;
    }

    public boolean pay(double amount) {
        return success;
    }

    public void printReceipt(double amount) {
        System.out.println(methodName +
                " | Thanh toán: " + amount +
                " | Thành công");
    }

    public static void main(String[] args) {
        double amount = 500000;

        Bai10 cash = new Bai10("Tiền mặt", true);
        Bai10 card = new Bai10("Thẻ tín dụng", false);
        Bai10 wallet = new Bai10("Ví điện tử", true);

        Bai10[] list = { cash, card, wallet };

        for (Bai10 p : list) {
            if (p.pay(amount)) {
                p.printReceipt(amount);
            } else {
                System.out.println(p.methodName + " | Thanh toán thất bại");
            }
        }
    }
}
