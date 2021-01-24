package pl.sdacademy.java.krk27.exercises.ex14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TableEx14 {

    int [] randomTable;
    static final int TABLE_SIZE = 100;
    public TableEx14() {
        Random randomInteger = new Random();
        randomTable = randomInteger.ints(1,TABLE_SIZE).limit(TABLE_SIZE).toArray();
    }

    public int [] uniqueElementsList(){
       return Arrays.stream(randomTable).distinct().toArray();
    }


    public int[] sameElements(){
       return entryStreamToArray(
               countyEntrySetStream().filter(s -> s.getValue()>1));
    }

    public int [] topSameElements(){
        return  entryStreamToArray(
                countyEntrySetStream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(25));
    }


    private Stream<Map.Entry<Integer, Long>> countyEntrySetStream(){
        return Arrays.stream(randomTable).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream();
    }


    private int[] entryStreamToArray(Stream<Map.Entry<Integer, Long>> stream){
        return stream.mapToInt(s -> (int) s.getKey()).toArray();
    }

    public void deduplicationValues(){
        Random random = new Random();
        for(int i = 0; i< randomTable.length; i++)
        {
            int finalI = i;
            if(Arrays.stream(sameElements())
            .anyMatch(n -> n == randomTable[finalI])){
                randomTable[i] = random.nextInt();
                i--;
            }
        }
    }

}
