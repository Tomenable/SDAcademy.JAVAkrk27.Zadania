package pl.sdacademy.java.krk27.exercises.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("Java", 18,"Python", 1,"PHP", 0);
        print(map);
        print2(map);
        print3(map);
    }
    public static void print(Map<String,Integer> map) {
        StringBuilder wypisz = new StringBuilder();
        for (var element : map.entrySet()){
            wypisz.append(" \nkey: " + element.getKey() + ", Value: " + element.getValue() +",");

            //System.out.println("Key: "+ element.getKey() + ", Value: " + element.getValue());
        }
        String result = wypisz.toString().substring(0, wypisz.length()-1).concat(".");
        System.out.println(result);
    }

    public static void print2(Map<String,Integer> map) {
        List<String> strings = new ArrayList<>();
        for (var element : map.entrySet()){
            strings.add("key: " + element.getKey() + ", Value: " + element.getValue());
        }
        System.out.println(String.join(",\n", strings) + ".");
    }

    public static void print3(Map<String,Integer> map) {
        System.out.println(
                map.entrySet().stream()
                .map(element -> "key: " + element.getKey() + ", Value: " + element.getValue())
                .collect(Collectors.joining(",\n")) + "."
        );
    }
}
