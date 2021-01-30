package pl.sdacademy.java.krk27.exercises.ex38;

public class Main {
    public static void main(String[] args) {
        CoffeMachine coffeMachine = new CoffeMachine();
        for (int i =1; i < 10; i++){
            int finalI = i;
            Thread thread1 = new Thread(() -> coffeMachine.makeCoffe(finalI));

            thread1.start();
       }
        new Thread(() -> coffeMachine.refillWater(20)).start();

        new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            coffeMachine.refillWater(80);

        }).start();
    }
}
