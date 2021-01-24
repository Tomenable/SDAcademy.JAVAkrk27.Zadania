package pl.sdacademy.java.krk27.exercises.ex24;

public class Basket {
    private int counter;
    static final int SIZE = 10;

    public void addToBasket() {
        if (counter < SIZE) {
            counter++;
        } else throw new BasketFullException();
    }

    public void removeFromBasket() {
        if (counter > 0) {
            counter--;
        } else throw new BasketEmptyException();
    }

    public static class BasketFullException extends RuntimeException {

    }

    public static class BasketEmptyException extends RuntimeException {

    }
}
