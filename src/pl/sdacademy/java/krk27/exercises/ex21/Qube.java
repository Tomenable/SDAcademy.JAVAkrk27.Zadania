package pl.sdacademy.java.krk27.exercises.ex21;

public class Qube extends Shape3D{
    private int a;



    @Override
    public double calculatePerimeter() {
        return 14*a;
    }

    @Override
    public double calculateArea() {
        return 6*Math.pow(a,2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(a,3);

    }
}
