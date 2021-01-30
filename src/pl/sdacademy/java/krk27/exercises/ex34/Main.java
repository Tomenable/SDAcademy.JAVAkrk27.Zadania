package pl.sdacademy.java.krk27.exercises.ex34;

import pl.sdacademy.java.krk27.exercises.ex35.MyRunnable;

public class Main {
    public static void main(String[] args) {
        MyThread myT = new MyThread();
        myT.start();

        MyRunnable myR = new MyRunnable();
        Thread thread = new Thread(myR);
        thread.start();

        Thread thread3 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        thread3.start();
    }
}
