package pl.sdacademy.java.krk27.exercises.ex9;

import pl.sdacademy.java.krk27.exercises.ex10.IMovable;
import pl.sdacademy.java.krk27.exercises.ex10.MoveDirection;

/*
stwórz klasę Circle, która będzie miała konstruktor:
Circle(Point2D center, Point2D point)
Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych
punktów, klasa Circle ma określać:
• promień okręgu przy wywołaniu metody double getRadius()
• obwód okręgu przy wywołaniu metody double getPerimeter()
• pole okręgu przy wywołaniu metody double getArea()
• *(trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody
List<Point2D> getSlicePoints()
 */
public class Circle implements IMovable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public Point2D getCenter() {
        return center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    public double getRadius() {
        return Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2);
    }
    public double getPerimeter() {
        return  2 * Math.PI * getRadius();
    }
    public double getArea() {
        return  Math.PI * Math.pow(getRadius(), 2);
    }


    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

}
