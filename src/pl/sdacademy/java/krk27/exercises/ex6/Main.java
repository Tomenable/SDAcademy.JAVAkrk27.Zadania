package pl.sdacademy.java.krk27.exercises.ex6;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("A", 1);
        map.put("D",4);
        map.put("B",2);
        map.put("C",3);



        entrySet(map);

    }

    public static void entrySet(TreeMap<String, Integer> map) {

        System.out.println(map.firstEntry());
        System.out.println( map.lastEntry());
    }
}
