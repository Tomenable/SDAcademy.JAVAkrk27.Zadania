package pl.sdacademy.java.krk27.exercises.zad;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GenericProduct implements Product{
    private Supplier<BigDecimal> supplier;
    private Predicate<LocalDate> predicate;

    public GenericProduct(Supplier<BigDecimal> supplier, Predicate<LocalDate> predicate) {
        this.supplier = supplier;
        this.predicate = predicate;
    }

    @Override
    public BigDecimal getPrice() {
        return supplier.get();
    }

    @Override
    public boolean isAvailable(LocalDate date) {
        return predicate.test(date);
    }
}
