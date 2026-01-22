package Lap0_5.bai1;
import java.util.Scanner;
public class bai1 {
    String street, city;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Street: ");
        street = sc.nextLine();
        System.out.print("City: ");
        city = sc.nextLine();
    }

    void display() {
        System.out.println("Address: " + street + ", " + city);
    }

    class Student {
        String id, name;
        bai1 address = new bai1();

        void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("ID: ");
            id = sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            address.input();
        }

        void display() {
            System.out.println(id + " - " + name);
            address.display();
        }
    }
}