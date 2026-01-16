package Lap3_1.Sv;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private Float diemToan;
    private Float diemLy;
    private Float diemHoa;


    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã Sinh Viên: ");
        maSV = sc.nextLine();
        System.out.print("Nhập Họ Tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập Điểm Toán: ");
        diemToan = sc.nextFloat();
        System.out.print("Nhập Điểm Lý: ");
        diemLy = sc.nextFloat();
        System.out.print("Nhập Điểm Hóa: ");
        diemHoa = sc.nextFloat();
    }
    public float tinhDTB(){
        return (diemToan + diemLy + diemHoa) / 3;

    }
    public  void hienThi(){
        System.out.println("MSV: "+maSV+" - hoTen: "+hoTen+" - DTB: "+tinhDTB());
    }
}
