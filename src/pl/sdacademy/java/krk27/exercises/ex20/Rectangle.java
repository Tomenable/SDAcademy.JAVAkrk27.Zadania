package pl.sdacademy.java.krk27.exercises.ex20;

public class Rectangle extends Shape{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a+2*b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }
}
