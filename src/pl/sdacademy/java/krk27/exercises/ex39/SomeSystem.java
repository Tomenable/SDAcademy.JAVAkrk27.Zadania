package pl.sdacademy.java.krk27.exercises.ex39;

public class SomeSystem {

    private int score;

    public SomeSystem(int score) {
        this.score = score;
    }

    public synchronized void setScore(String sender, int oldScore, int newScore) {
        if(oldScore == score) {
            this.score = newScore;
            System.out.println(sender + " updates " + oldScore + " -> " + newScore);
            notifyAll();
        }
    }

    public synchronized void waitForNewScore() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getScore() {
        return score;
    }
}
