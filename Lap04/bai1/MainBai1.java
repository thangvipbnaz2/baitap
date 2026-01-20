package Lap04.bai1;

public class MainBai1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId("SV01");
        st.setName("Nguyen Van A");
        st.setScore(6.5);
        st.display();
        System.out.println("Pass: " + st.isPass());
    }
}
