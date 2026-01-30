package Lap09.Bai2;

public class ExcelReport extends Report {
    public ExcelReport(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("Generating Excel report");
    }
}
