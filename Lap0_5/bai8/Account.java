package Lap0_5.bai8;

public class Account {
    String username, password;


    boolean checkLogin(String u, String p) {
        return username.equals(u) && password.equals(p);
    }
}
