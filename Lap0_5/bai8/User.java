package Lap0_5.bai8;
import java.util.Scanner;
public class User {
    String name;
    Account account;


    void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();
        System.out.println(account.checkLogin(u, p) ? "Đăng nhập đúng" : "Sai thông tin");
    }
}
