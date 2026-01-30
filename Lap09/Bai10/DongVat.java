package Lap09.Bai10;

public abstract class DongVat {
    protected String ten;
    protected int tuoi;

    public DongVat(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public abstract void keu();

    public void hienThi() {
        System.out.println(ten + " - " + tuoi);
    }
}
