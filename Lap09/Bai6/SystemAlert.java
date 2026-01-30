package Lap09.Bai6;

public class SystemAlert {
    protected String message;

    public SystemAlert(String message) {
        this.message = message;
    }

    public void show() {
        System.out.println("Alert");
    }
}
