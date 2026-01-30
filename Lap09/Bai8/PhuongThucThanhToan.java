package Lap09.Bai8;

public abstract class PhuongThucThanhToan {
    protected String tenPhuongThuc;

    public abstract double phiGiaoDich(double soTien);

    public void hienThi() {
        System.out.println("Phuong thuc: " + tenPhuongThuc);
    }
}
