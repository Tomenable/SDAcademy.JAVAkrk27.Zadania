package pl.sdacademy.java.krk27.exercises.ex7;

public class Main {

    public static void main(String[] args) {
        Magazine magazine = new Magazine(10);

        for (int i = 0; i < 12; i++) {
            magazine.loadBullet("Bullet" + (i+1));
        }
        while (magazine.isLoaded()){
            magazine.shot();
        }
        magazine.shot();
    }
}
