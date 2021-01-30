package pl.sdacademy.java.krk27.exercises.ex39;

import java.util.List;

public class Sensor implements Runnable{

    List<Integer> results;
    private String name;

    public Sensor(List<Integer> results, String name) {
        this.results = results;
        this.name = name;
    }

    @Override
    public synchronized void run() {
        while (true){
            List<Integer> temp = results;
            try {
                Thread.sleep(( long ) (Math.random()*1000) );
                if(temp.equals(results)){
                    System.out.println("Dodanie nowej wartości do wyników");
                    results.add(( int ) (Math.random()*1000));
                    results.notifyAll();
                }else {
                    System.out.println("Tablica wyników się zmieniła, przerwanie woperacji");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
