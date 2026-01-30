package Lap09.Bai3;

public class FacebookLogin extends LoginMethod {
    public FacebookLogin(String userId) {
        super(userId);
    }

    @Override
    public void login() {
        System.out.println("Login by Facebook");
    }
}
