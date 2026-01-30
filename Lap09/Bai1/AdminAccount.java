package Lap09.Bai1;

public class AdminAccount extends Account {
    public AdminAccount(String username) {
        super(username);
    }

    @Override
    public String getRole() {
        return "ADMIN";
    }
}
