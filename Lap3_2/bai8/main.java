package Lap3_2.bai8;

public class main {
    public static void main(String[] args) {
        Book b = new Book();

        b.input();
        b.display();

        if (b.isExpensive()) {
            System.out.println("Sách có giá cao");
        }

        if (b.isOldBook()) {
            System.out.println("Sách xuất bản trước năm 2015");
        }
    }
}
