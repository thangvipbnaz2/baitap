package Lap09.Bai1;

public class StudentAccount extends Account {
    public StudentAccount(String username) {
        super(username);
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }
}

