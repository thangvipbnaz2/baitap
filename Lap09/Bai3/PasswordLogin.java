package Lap09.Bai3;

public class PasswordLogin extends LoginMethod {
    public PasswordLogin(String userId) {
        super(userId);
    }

    @Override
    public void login() {
        System.out.println("Login by password");
    }
}
