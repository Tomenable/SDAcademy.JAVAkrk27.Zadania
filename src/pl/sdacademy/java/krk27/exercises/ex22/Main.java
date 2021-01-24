package pl.sdacademy.java.krk27.exercises.ex22;

import pl.sdacademy.java.krk27.exercises.ex21.Cone;

public class Main {
    public static void main(String[] args) {

        Cone cone  = new Cone(5,10,15);

        cone.fill(15);
        cone.fill(cone.calculateVolume()+15);
        cone.fill(cone.calculateVolume());
    }
}
