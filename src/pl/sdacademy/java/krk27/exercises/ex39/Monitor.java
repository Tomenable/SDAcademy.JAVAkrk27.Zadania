package pl.sdacademy.java.krk27.exercises.ex39;

import java.util.List;

public class Monitor implements Runnable{

    SomeSystem system;
    private String nameOfMonitor;

    public Monitor(SomeSystem system, String nameOfMonitor) {
        this.system = system;
        this.nameOfMonitor = nameOfMonitor;
    }

    @Override
    public void run() {
        while (true) {
            system.waitForNewScore();
            System.out.println(nameOfMonitor + " results = " + system.getScore());
        }

        /*var cache = system.getScore();
        while (true) {
            while (cache == system.getScore())
            {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            cache = system.getScore();
            System.out.println(nameOfMonitor + " results = " + cache);
        }*/
    }
}
