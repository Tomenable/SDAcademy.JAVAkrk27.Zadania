package pl.sdacademy.java.krk27.exercises.ex14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TableEx14 lista = new TableEx14();
        System.out.println(Arrays.toString(lista.uniqueElementsList()) );

        System.out.println(Arrays.toString(lista.sameElements()));

        System.out.println(Arrays.toString(lista.topSameElements()));

        System.out.println(lista.uniqueElementsList().length);

        lista.deduplicationValues();
        System.out.println(lista.uniqueElementsList().length);


    }
}
