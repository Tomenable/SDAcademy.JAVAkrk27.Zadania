package pl.sdacademy.java.krk27.exercises.ex11;

import pl.sdacademy.java.krk27.exercises.ex9.Circle;
import pl.sdacademy.java.krk27.exercises.ex9.Point2D;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(-10, 30), new Point2D(15, 20));
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        circle.resizeFactor(10);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

}
