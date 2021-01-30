package pl.sdacademy.java.krk27.exercises.ex28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EveryNthElement<E> extends ArrayList<E> {


    public List<E> getEveryNthElement(int start, int skip) {
        List<E> temp = new ArrayList<>();
        for (int i = start; i < super.size(); i += 1 + skip) {
            temp.add(super.get(i));
        }
        return temp;
    }

    public List<E> getEveryNthElementStream(int start, int skip) {
        return  IntStream.range(0, super.size() - start)
                .filter(i -> i % (1+skip) == 0)
                .mapToObj(i->super.get(i+start))
                .collect(Collectors.toList());
    }

}
