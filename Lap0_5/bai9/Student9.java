package Lap0_5.bai9;

public class Student9 {
    String name;
    Score score = new Score();


    void display() {
        System.out.println("SV: " + name + " - DTB: " + score.getAverage());
    }
}
