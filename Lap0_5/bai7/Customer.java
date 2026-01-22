package Lap0_5.bai7;

import java.util.Scanner;

public class Customer {
    String id, name;
    Address address = new Address();

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã KH: ");
        id = sc.nextLine();
        System.out.print("Nhập tên KH: ");
        name = sc.nextLine();
        address.input();
    }

    void display() {
        System.out.println(id + " - " + name);
        address.display();
    }
}
