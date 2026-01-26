package Lap07.bai7;

public class Bai7 {
    String name;
    double income;

    public Bai7(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void showIncome() {
        System.out.println(name + " - Thu nhập: " + getIncome());
    }

    public static void main(String[] args) {
        Bai7 office = new Bai7("An", 10000000);
        Bai7 sales = new Bai7("Bình", 7000000 + 3000000);

        office.showIncome();
        sales.showIncome();

        System.out.println("Tổng thu nhập công ty: " +
                (office.getIncome() + sales.getIncome()));
    }
}
