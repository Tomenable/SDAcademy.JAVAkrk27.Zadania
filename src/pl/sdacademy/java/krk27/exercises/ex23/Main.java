package pl.sdacademy.java.krk27.exercises.ex23;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimals("Lew",8);
        zoo.addAnimals("żyrafa",10);
        zoo.addAnimals("Wielbłąd",12);

        int numberOfAllAnimals = zoo.getNumberOfAllAnimals();

        System.out.println("numberOfAllAnimals = " + numberOfAllAnimals);

        Map<String, Integer> animalsCount = zoo.getAnimalsCount();

        System.out.println("animalsCount = " + animalsCount);

        Map<String, Integer> animalsSorted = zoo.getAnimalsSorted();

        System.out.println("animalsSorted = " + animalsSorted);

    }
}
