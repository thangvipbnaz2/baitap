package Lap09.Bai5;

public class Main {
    public static void main(String[] args) {
        Printer[] printers = {
                new LaserPrinter("HP"),
                new InkPrinter("Canon"),
                new PDFPrinter("PDF")
        };

        for (Printer p : printers) {
            p.print();
        }
    }
}
