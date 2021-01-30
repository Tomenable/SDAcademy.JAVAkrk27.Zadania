package pl.sdacademy.java.krk27.exercises.zad;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Product bag = new GenericProduct(() -> new BigDecimal(200.00), s-> LocalDate.of(2021,1,31).isBefore(s));
        Product socks = new GenericProduct(() -> new BigDecimal(25.00), s -> true);
        basket.addToBasket(bag);
        basket.addToBasket(socks);

        System.out.println(basket.getBasket());

    }
}
