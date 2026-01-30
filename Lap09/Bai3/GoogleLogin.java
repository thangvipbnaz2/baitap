package Lap09.Bai3;

public class GoogleLogin extends LoginMethod {
    public GoogleLogin(String userId) {
        super(userId);
    }

    @Override
    public void login() {
        System.out.println("Login by Google");
    }
}
