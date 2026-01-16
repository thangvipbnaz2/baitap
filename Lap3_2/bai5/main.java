package Lap3_2.bai5;

public class main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456789", "Nguyễn Văn A", 5000000);

        acc.display();

        acc.deposit(2000000);
        System.out.println("Số dư sau khi nạp: " + acc.checkBalance());

        acc.withdraw(3000000);
        System.out.println("Số dư sau khi rút: " + acc.checkBalance());
    }
}
