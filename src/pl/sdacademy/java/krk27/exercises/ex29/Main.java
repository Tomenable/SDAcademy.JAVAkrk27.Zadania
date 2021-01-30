package pl.sdacademy.java.krk27.exercises.ex29;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Integer[] table = IntStream.range(0, 10).boxed().toArray(Integer[]::new);
        System.out.println(partOf(table, s -> s % 2 == 0) + " %");

    }

    //public static <T> double partOf(T[] toAdd, Function<T, Boolean> function) {
    public static <T> double partOf(T[] toAdd, Predicate<T> function) {
        double iloscSpelniajacaWarunek;

        iloscSpelniajacaWarunek = Arrays.stream(toAdd).filter(s -> function.test(s)).count();
        return (iloscSpelniajacaWarunek / toAdd.length) * 100;

    }
}
