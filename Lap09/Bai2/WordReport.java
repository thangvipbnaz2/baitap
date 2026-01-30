package Lap09.Bai2;

public class WordReport extends Report {
    public WordReport(String title) {
        super(title);
    }

    @Override
    public void generate() {
        System.out.println("Generating Word report");
    }
}
