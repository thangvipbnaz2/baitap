package Lap0_5.bai10;

public class Flight {
    String flightCode;
    Time departureTime;


    void display() {
        System.out.print("Chuyến bay " + flightCode + " - Giờ bay: ");
        departureTime.display();
    }
}
