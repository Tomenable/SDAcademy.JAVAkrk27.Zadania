package pl.sdacademy.java.krk27.exercises.ex20;

public class Triangle extends Shape{
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * a ;
    }

    @Override
    public double calculateArea() {
        return a * h /2.;
    }
}
