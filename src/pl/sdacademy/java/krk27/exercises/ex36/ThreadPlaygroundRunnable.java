package pl.sdacademy.java.krk27.exercises.ex36;

public class ThreadPlaygroundRunnable implements Runnable{

    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf( "Thread =  %s, name = %s, iteration = %d%n",
                    Thread.currentThread().getName(),name, i);
        }
    }
}
