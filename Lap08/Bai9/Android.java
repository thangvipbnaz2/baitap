package Lap08.Bai9;

public class Android implements Workable, Eatable, Sleepable {
    public void work() {
        System.out.println("Android working");
    }

    public void eat() {
        System.out.println("Android eating");
    }

    public void sleep() {
        System.out.println("Android sleeping");
    }
}
