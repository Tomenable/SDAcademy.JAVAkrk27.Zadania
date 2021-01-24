package pl.sdacademy.java.krk27.exercises.ex14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TableEx14 {

    int [] randomTable;
    static final int TABLE_SIZE = 100000;
    public TableEx14() {
        Random randomInteger = new Random();
        randomTable = randomInteger.ints(1,100000).limit(TABLE_SIZE).toArray();
    }

    public int [] uniqueElementsList(){
       return Arrays.stream(randomTable).distinct().toArray();
    }
    public int[] sameElements(){
       return Arrays.stream(randomTable).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue()>1).mapToInt(s -> (int) s.getKey()).toArray();
    }

    public int [] topSameElements(){
        return Arrays.stream(randomTable).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(25)
                .mapToInt(s -> (int) s.getKey()).toArray();

    }

}
