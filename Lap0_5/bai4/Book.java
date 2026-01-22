package Lap0_5.bai4;

public class Book {
    String title;
    double price;
    Author author;


    void display() {
        System.out.println("Sách: " + title + " - Giá: " + price);
        author.display();
    }
}
