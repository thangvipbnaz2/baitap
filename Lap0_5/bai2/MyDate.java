package Lap0_5.bai2;

public class MyDate {
    int day, month, year;

    public MyDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
