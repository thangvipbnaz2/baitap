package Lap3_2.bai1;

public class main {
    public static void main(String[] args) {
        bai1 st = new bai1();
        st.input();
        st.display();
        if(st.ispass()){
            System.out.print("Sinh Viên Đạt");
        }
        else
            System.out.print("Sinh Viên Không Đạt");
    }
}
