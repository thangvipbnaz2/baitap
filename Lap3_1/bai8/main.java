package Lap3_1.bai8;

public class main {
    public static void main(String[] args) {
        bai8 b8 = new bai8();
        b8.input();
        b8.display();
        System.out.println(b8.isExpensive() ? "Sách đắt" : "Sách rẻ");
        System.out.println(b8.isOldBook() ? "Sách cũ" : "Sách mới");
    }
}
