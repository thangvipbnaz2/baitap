package Lap09.Bai7;

public class Main {
    public static void main(String[] args) {
        NhanVien[] ds = {
                new NhanVienFullTime("NV01", "An", 5000, 1000),
                new NhanVienPartTime("NV02", "Binh", 80, 50)
        };

        for (NhanVien nv : ds) {
            nv.hienThi();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}
