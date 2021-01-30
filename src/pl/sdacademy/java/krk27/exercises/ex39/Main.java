package pl.sdacademy.java.krk27.exercises.ex39;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> wyniki = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            wyniki.add(i);
        }


        for (int i = 0; i < 5; i++) {
            new Thread(new Monitor(wyniki,"Monitor - "+i)).start();
            new Thread(new Sensor(wyniki,"Sensor - "+i)).start();
        }


    }
}
