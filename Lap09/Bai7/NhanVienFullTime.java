package Lap09.Bai7;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double thuong;

    public NhanVienFullTime(String ma, String ten, double lcb, double thuong) {
        super(ma, ten);
        this.luongCoBan = lcb;
        this.thuong = thuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + thuong;
    }
}
