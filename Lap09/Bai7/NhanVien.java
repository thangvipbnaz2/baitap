package Lap09.Bai7;

public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;

    public NhanVien(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public abstract double tinhLuong();

    public void hienThi() {
        System.out.println(maNV + " - " + tenNV);
    }
}
