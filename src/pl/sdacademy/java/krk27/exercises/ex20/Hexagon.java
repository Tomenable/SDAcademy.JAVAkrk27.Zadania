package pl.sdacademy.java.krk27.exercises.ex20;

public class Hexagon extends Shape{
    private int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        return 6*a;
    }

    @Override
    public double calculateArea() {
        return 3 * Math.sqrt(3) * Math.pow(a,2) / 2.;
    }
}
