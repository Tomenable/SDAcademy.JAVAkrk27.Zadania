package pl.sdacademy.java.krk27.exercises.ex39;

import java.util.List;

public class Monitor implements Runnable{

    List<Integer> results;
    private String nameOfMonitor;

    public Monitor(List<Integer> results, String nameOfMonitor) {
        this.results = results;
        this.nameOfMonitor = nameOfMonitor;
    }

    @Override
    public synchronized void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("results = " + results);
            try {
                results.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
