package pl.sdacademy.java.krk27.exercises.ex39;

import java.util.List;
import java.util.Random;

public class Sensor implements Runnable{

    SomeSystem system;
    private String name;

    public Sensor(SomeSystem system, String name) {
        this.system = system;
        this.name = name;
    }

    @Override
    public synchronized void run() {
        while (true){
            var temp = system.getScore();
            try {
                Thread.sleep(( long ) (Math.random()*10000) );
                system.setScore(name, temp, new Random().nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
