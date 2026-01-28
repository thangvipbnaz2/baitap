package Lap08.Bai9;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        Robot r = new Robot();
        Android a = new Android();

        h.work();
        h.eat();

        r.work();

        a.work();
        a.eat();
        a.sleep();
    }
}
