package Lap09.Bai7;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;
    private double luongGio;

    public NhanVienPartTime(String ma, String ten, int gio, double luong) {
        super(ma, ten);
        this.soGioLam = gio;
        this.luongGio = luong;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongGio;
    }
}
