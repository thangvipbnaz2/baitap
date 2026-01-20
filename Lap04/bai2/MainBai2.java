package Lap04.bai2;

public class MainBai2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123", "Toan", 1000);
        acc.displayInfo();
        acc.deposit(500);
        acc.displayInfo();
        acc.withdraw(300);
        acc.displayInfo();
    }
}
