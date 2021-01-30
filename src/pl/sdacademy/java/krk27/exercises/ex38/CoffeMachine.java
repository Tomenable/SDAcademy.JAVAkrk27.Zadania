package pl.sdacademy.java.krk27.exercises.ex38;

public class CoffeMachine {

    private int capacity;
    private static final int WATER_FOR_COFFE = 5;

    public synchronized void refillWater(int toAdd){
        capacity = capacity + toAdd;
        notifyAll();
    }
    public synchronized void makeCoffe(int i){

        while (capacity<WATER_FOR_COFFE) {
            System.out.println("czekam na wode" + i);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            capacity = capacity - WATER_FOR_COFFE;
            System.out.println(i + " Kawa zwobiona, pozostało wody: " + capacity);

    }
}
