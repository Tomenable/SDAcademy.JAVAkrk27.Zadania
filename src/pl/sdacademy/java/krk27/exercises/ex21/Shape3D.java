package pl.sdacademy.java.krk27.exercises.ex21;

import pl.sdacademy.java.krk27.exercises.ex20.Shape;
import pl.sdacademy.java.krk27.exercises.ex22.Fillable;

public abstract class Shape3D extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public int fill(double volume) {
        int result = Double.compare(volume, calculateVolume());
        switch (result) {
            case -1:
                System.out.println("Za mało wody");
                break;
            case 0:
                System.out.println("po brzegi");
                break;
            case 1:
                System.out.println("wylewa się");
                break;
        }
        return result;
    }
}
