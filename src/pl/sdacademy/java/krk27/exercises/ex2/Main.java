package pl.sdacademy.java.krk27.exercises.ex2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "A", "C", "E");

        List<String> resultList = getBackwardsCaseInsensitive(list);


        System.out.println("resultList = " + resultList);
    }


    public static List<String> getBackwardsCaseInsensitive(List<String> list){
        return list.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
    }
}
