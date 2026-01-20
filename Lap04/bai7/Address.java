package Lap04.bai7;

public class Address {
    String street;
    String city;


    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

}
class Student2 {
    String id;
    String name;
    Address address;


    public void display() {
        System.out.println(id + " - " + name + " - " + address.street + ", " + address.city);
    }
}