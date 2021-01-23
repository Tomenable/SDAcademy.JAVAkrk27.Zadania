package pl.sdacademy.java.krk27.exercises.ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "A", "C", "E");
        list = sortBackwards(list);
        System.out.println(list);
    }

    public static List<String> sortBackwards(List<String> string) {
        return string.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
