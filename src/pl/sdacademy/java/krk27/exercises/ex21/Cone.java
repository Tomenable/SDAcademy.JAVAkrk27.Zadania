package pl.sdacademy.java.krk27.exercises.ex21;

public class Cone extends Shape3D{
    private int a;
    private int h;
    private int r;

    public Cone(int a, int h, int r) {
        this.a = a;
        this.h = h;
        this.r = r;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    public int getR() {
        return r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a+2*Math.PI*r*2;
    }

    @Override
    public double calculateArea() {
        return Math.pow(r,2)*Math.PI + Math.PI*a*r;
    }

    @Override
    public double calculateVolume() {
        return Math.PI*Math.pow(r,2)*h/3.;
    }


}
