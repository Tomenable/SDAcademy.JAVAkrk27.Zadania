package pl.sdacademy.java.krk27.exercises.ex39;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var system = new SomeSystem(10);


        for (int i = 0; i < 5; i++) {
            new Thread(new Monitor(system,"Monitor - "+i)).start();
            new Thread(new Sensor(system,"Sensor - "+i)).start();
        }


    }
}
