package pl.sdacademy.java.krk27.exercises.ex35;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
