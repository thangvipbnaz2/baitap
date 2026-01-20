package Lap04.bai9;

public class MainBai9 {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel", 3.2);
        Computer c = new Computer("Dell", cpu);
        c.displayInfo();
    }
}
