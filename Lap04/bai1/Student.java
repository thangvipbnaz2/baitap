package Lap04.bai1;

public class Student {
    private String id;
    private String name;
    private double score;


    public String getId() { return id; }
    public void setId(String id) { this.id = id; }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }


    public boolean isPass() {
        return score >= 5;
    }


    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Score: " + score);
    }

}
