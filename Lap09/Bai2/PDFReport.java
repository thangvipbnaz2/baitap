package Lap09.Bai2;

public class PDFReport extends Report {
    public PDFReport(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("Generating PDF report");
    }
}
