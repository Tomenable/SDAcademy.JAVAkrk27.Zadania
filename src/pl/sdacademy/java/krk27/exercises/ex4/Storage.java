package pl.sdacademy.java.krk27.exercises.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    Map<String, List<String>> map;

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public Storage() {
        this(new HashMap<>());
    }
    public void addToStorage(String key, String value) {
        if(!map.containsKey(key))
        {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);

    }
    public void printValues(String key)  {
        if(map.containsKey(key))
        {
            map.get(key).forEach(System.out::println);
        }
    }
    public void findValues(String value){
        map.entrySet().stream()
                .filter(element -> element.getValue().contains(value))
                .map(l -> l.getKey())
                .forEach(System.out::println);
    }


}
