package pl.sdacademy.java.krk27.exercises.ex10;

import pl.sdacademy.java.krk27.exercises.ex9.Circle;
import pl.sdacademy.java.krk27.exercises.ex9.Point2D;

public class Main {
    /*
    Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor. Stwórz
interfejs Movable posiadający metodę move(MoveDirection moveDirection).
Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle). Przy wywołaniu metody
move(MoveDirection moveDirection), obiekty mają zmienić swoje położenie na podstawie przekazanego
kierunku (MoveDirection).
Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle
     */

    public static void main(String[] args) {

        Circle circle = new Circle(new Point2D(2,6), new Point2D(3,5));
        double radius = circle.getRadius();
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();
        System.out.println("circle.getCenter() = " + circle.getCenter());
        System.out.println("circle.getPoint() = " + circle.getPoint());

        MoveDirection moveDirection = new MoveDirection(5, 7);
        circle.move(moveDirection);

        boolean b = radius == circle.getRadius();
        System.out.println(b);
        System.out.println(perimeter == circle.getPerimeter());
        System.out.println(area == circle.getArea());

        System.out.println("circle.getCenter() = " + circle.getCenter());
        System.out.println("circle.getPoint() = " + circle.getPoint());


    }
}
