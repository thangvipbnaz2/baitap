package Lap09.Bai2;

public class Report {
    protected String title;

    public Report(String title) {
        this.title = title;
    }

    public void generate() {
        System.out.println("Generating report");
    }
}
