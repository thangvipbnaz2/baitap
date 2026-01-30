package Lap09.Bai10;

public class Main {
    public static void main(String[] args) {
        DongVat[] ds = {
                new Cho("Cho", 3),
                new Chim("Chim", 1)
        };

        for (DongVat dv : ds) {
            dv.keu();
            if (dv instanceof CoTheBay) {
                ((CoTheBay) dv).bay();
            }
        }
    }
}
