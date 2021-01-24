package pl.sdacademy.java.krk27.exercises.ex25.ex24;

public class Basket {
    private int counter =0;
    static final int SIZE = 10;

    public void addToBasket() throws BasketFullException {
        if (counter < SIZE) {
            counter++;
        } else throw new BasketFullException();
    }

    public void removeFromBasket() throws BasketEmptyException {
        if (counter > 0) {
            counter--;
        } else throw new BasketEmptyException();
    }

    public static class BasketFullException extends Exception {

    }

    public static class BasketEmptyException extends Exception {

    }
}
