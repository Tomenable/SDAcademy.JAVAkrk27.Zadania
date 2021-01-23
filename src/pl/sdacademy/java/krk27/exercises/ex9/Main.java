package pl.sdacademy.java.krk27.exercises.ex9;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(-10, 30), new Point2D(15, 20));
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

}
