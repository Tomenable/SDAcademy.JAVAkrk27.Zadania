package pl.sdacademy.java.krk27.exercises.ex23;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zoo {
    private List<String > animals = new ArrayList<>();

    public void addAnimals(String animal, int number){

        animals.addAll(Stream.generate(()->animal)
                .limit(number)
                .collect(Collectors.toList()));
    }

    public int getNumberOfAllAnimals(){
        return animals.size();
    }

    public Map<String, Integer> getAnimalsCount(){
//        return zwierzeta.stream().collect(Collectors.groupingBy(a -> a)).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,a -> a.getValue().size()));


        Map<String, Long> collect = animals.stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return collect.entrySet()
                .stream().collect(Collectors.toMap(Map.Entry::getKey, e -> Math.toIntExact(e.getValue())));
    }


    public Map<String, Integer> getAnimalsSorted(){

        return getAnimalsCount().entrySet().stream()
                .sorted(Map.Entry
                        .comparingByValue(Comparator.reverseOrder()))
                .collect(LinkedHashMap::new,(map, item)->map.put(item.getKey(),item.getValue()),Map::putAll);
    }



}
