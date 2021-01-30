package pl.sdacademy.java.krk27.exercises.ex37;

import pl.sdacademy.java.krk27.exercises.ex36.ThreadPlaygroundRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executor.submit(new ThreadPlaygroundRunnable("Zadanie-"+i));
        }

        executor.shutdown();
    }
}
