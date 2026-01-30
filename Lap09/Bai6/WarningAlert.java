package Lap09.Bai6;

public class WarningAlert extends SystemAlert {
    public WarningAlert(String message) {
        super(message);
    }

    @Override
    public void show() {
        System.out.println("Warning: " + message);
    }
}
