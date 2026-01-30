package Lap09.Bai8;

public class ThanhToanThe extends PhuongThucThanhToan implements ThanhToan {

    public ThanhToanThe() {
        tenPhuongThuc = "The";
    }

    @Override
    public double phiGiaoDich(double soTien) {
        return soTien * 0.02;
    }

    @Override
    public double thanhToan(double soTien) {
        return soTien + phiGiaoDich(soTien);
    }
}

