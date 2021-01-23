package pl.sdacademy.java.krk27.exercises.ex3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("Java", 18,"Python", 1,"PHP", 0);
        print(map);
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


}
