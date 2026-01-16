package Lap3_1.bai5;

public class main {
    public static void main(String[] args) {
        bai5 b5 = new bai5();
        b5.deposit(5_000_000);
        b5.withdraw(2_000_000);
        System.out.println("Số dư: " + b5.checkBalance());
    }
}
