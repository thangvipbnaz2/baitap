package Lap09.Bai8;

public class ThanhToanTienMat extends PhuongThucThanhToan implements ThanhToan {

    public ThanhToanTienMat() {
        tenPhuongThuc = "Tien Mat";
    }

    @Override
    public double phiGiaoDich(double soTien) {
        return 0;
    }

    @Override
    public double thanhToan(double soTien) {
        return soTien + phiGiaoDich(soTien);
    }
}
