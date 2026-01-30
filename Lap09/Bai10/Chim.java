package Lap09.Bai10;

public class Chim extends DongVat implements CoTheBay {
    public Chim(String ten, int tuoi) {
        super(ten, tuoi);
    }

    @Override
    public void keu() {
        System.out.println("Chíp chíp");
    }

    @Override
    public void bay() {
        System.out.println("Chim dang bay");
    }
}

