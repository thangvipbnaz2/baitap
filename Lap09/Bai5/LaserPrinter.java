package Lap09.Bai5;

public class LaserPrinter extends Printer {
    public LaserPrinter(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Printing by Laser Printer");
    }
}


