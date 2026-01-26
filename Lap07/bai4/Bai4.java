package Lap07.bai4;

public class Bai4 {
    String name;
    String sound;
    String move;

    public Bai4(String name, String sound, String move) {
        this.name = name;
        this.sound = sound;
        this.move = move;
    }

    public void show() {
        System.out.println("Tên: " + name);
        System.out.println("Kêu: " + sound);
        System.out.println("Di chuyển: " + move);
    }

    public static void main(String[] args) {
        Bai4 dog = new Bai4("Chó", "Gâu gâu", "Chạy");
        Bai4 cat = new Bai4("Mèo", "Meo meo", "Đi nhẹ");
        Bai4 bird = new Bai4("Chim", "Hót", "Bay");

        dog.show();
        cat.show();
        bird.show();
    }
}
