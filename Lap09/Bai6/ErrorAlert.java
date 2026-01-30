package Lap09.Bai6;

public class ErrorAlert extends SystemAlert {
    public ErrorAlert(String message) {
        super(message);
    }

    @Override
    public void show() {
        System.out.println("Error: " + message);
    }
}
