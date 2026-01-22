package Lap0_5.bai6;

public class House {
    String houseId;
    Room room;


    void display() {
        System.out.println("Nhà: " + houseId);
        room.display();
    }
}
