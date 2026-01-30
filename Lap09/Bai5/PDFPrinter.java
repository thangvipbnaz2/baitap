package Lap09.Bai5;

public class PDFPrinter extends Printer {
    public PDFPrinter(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("Printing PDF file");
    }
}

