package Lap09.Bai1;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
                new AdminAccount("admin01"),
                new StudentAccount("sv01"),
                new GuestAccount("guest01")
        };

        for (Account a : accounts) {
            System.out.println(a.getRole());
        }
    }
}
