package pl.sdacademy.java.krk27.exercises.ex28;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EveryNthElement<String > test = new EveryNthElement<>();
        test.addAll(List.of("a","b","c","d","e","f","g"));

        List<String> resultList = test.getEveryNthElement(2, 3);

        List<String> resultOfStream = test.getEveryNthElementStream(2, 3);

        System.out.println("resultList = " + resultList);
        System.out.println(resultOfStream);
    }
}
