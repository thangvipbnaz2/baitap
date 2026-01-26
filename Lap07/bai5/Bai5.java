package Lap07.bai5;

public class Bai5 {
    String accountNumber;
    double balance;
    double interestRate;

    public Bai5(String acc, double rate) {
        accountNumber = acc;
        interestRate = rate;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void showInfo() {
        System.out.println("TK: " + accountNumber +
                " | Số dư: " + balance +
                " | Lãi: " + calculateInterest());
    }

    public static void main(String[] args) {
        Bai5 saving = new Bai5("001", 0.05);
        Bai5 checking = new Bai5("002", 0.01);

        saving.deposit(10000000);
        checking.deposit(8000000);

        saving.withdraw(2000000);

        saving.showInfo();
        checking.showInfo();
    }
}
