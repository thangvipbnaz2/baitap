package Lap09.Bai6;

public class SuccessAlert extends SystemAlert {
    public SuccessAlert(String message) {
        super(message);
    }

    @Override
    public void show() {
        System.out.println("Success: " + message);
    }
}
