package Lap09.Bai1;

public class GuestAccount extends Account {
    public GuestAccount(String username) {
        super(username);
    }

    @Override
    public String getRole() {
        return "GUEST";
    }
}
