package pl.sdacademy.java.krk27.exercises.ex36;

public class Main {

    public static void main(String[] args) {
        Thread first = new Thread(new ThreadPlaygroundRunnable("First"));
        Thread second = new Thread(new ThreadPlaygroundRunnable("Second"));

        first.start();
        second.start();
    }
}
