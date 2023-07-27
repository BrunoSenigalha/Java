package entities;

public class People {
    private final double height;
    private final char gender;

    public People(double height, char gender){
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }
}
