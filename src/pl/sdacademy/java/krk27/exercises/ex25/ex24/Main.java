package pl.sdacademy.java.krk27.exercises.ex25.ex24;

public class Main {
    public static void main(String[] args) {
        Basket newBasket = new Basket();

        try {
            newBasket.addToBasket();
            newBasket.addToBasket();
            newBasket.addToBasket();
            newBasket.addToBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
            newBasket.removeFromBasket();
        } catch (Basket.BasketFullException e) {
            System.out.println("Koszyk pełny");
        } catch (Basket.BasketEmptyException e) {
            System.out.println("Koszyk pusty");
        }


    }
}
