package Lap04.bai7;

public class MainBai7 {
    public static void main(String[] args) {
        Address ad = new Address("123 Le Loi", "HCM");
        Student2 st = new Student2();
        st.id = "SV02";
        st.name = "Minh";
        st.address = ad;
        st.display();
    }
}
