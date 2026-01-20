package Lap04.bai2;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;


    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }


    public void displayInfo() {
        System.out.println(accountNumber + " - " + ownerName + " - Balance: " + balance);
    }
}
