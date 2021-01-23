package pl.sdacademy.java.krk27.exercises.ex5;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        SDAHashSet<String> sdaHashSet = new SDAHashSet<>();

        sdaHashSet.add("first");
        sdaHashSet.add("second");
        sdaHashSet.add("third");
        sdaHashSet.add("fourth");


        sdaHashSet.remove("third");
        sdaHashSet.remove("third");
        boolean third = sdaHashSet.contains("third");
        System.out.println(third);

        boolean first = sdaHashSet.contains("first");
        System.out.println(first);



    }

}
