package Lap0_5.bai7;

import java.util.Scanner;

public class Address {
    String street;
    String city;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên đường: ");
        street = sc.nextLine();
        System.out.print("Nhập thành phố: ");
        city = sc.nextLine();
    }

    void display() {
        System.out.println("Địa chỉ: " + street + ", " + city);
    }
}
