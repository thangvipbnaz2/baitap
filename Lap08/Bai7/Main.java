package Lap08.Bai7;

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;

        System.out.println("Add: " + add.operate(10, 5));
        System.out.println("Sub: " + sub.operate(10, 5));
        System.out.println("Mul: " + mul.operate(10, 5));
    }
}
