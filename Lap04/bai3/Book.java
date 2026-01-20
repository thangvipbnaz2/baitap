package Lap04.bai3;

public class Book {
    private String id;
    private String title;
    private double price;


    public Book() {
        this.price = 0;
    }


    public Book(String id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }


    public void display() {
        System.out.println(id + " - " + title + " - " + price);
    }
}
