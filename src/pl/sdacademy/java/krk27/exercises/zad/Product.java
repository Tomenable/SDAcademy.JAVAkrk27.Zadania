package pl.sdacademy.java.krk27.exercises.zad;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Product {
    BigDecimal getPrice();
    boolean isAvailable(LocalDate date);
}
