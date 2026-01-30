package Lap09.Bai5;

public class InkPrinter extends Printer {
    public InkPrinter(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Printing by Ink Printer");
    }
}
