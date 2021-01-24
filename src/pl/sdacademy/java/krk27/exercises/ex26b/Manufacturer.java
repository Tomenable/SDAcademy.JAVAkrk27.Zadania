package pl.sdacademy.java.krk27.exercises.ex26b;

import java.util.List;

public class Manufacturer {
    public String name;
    public int yearOfCreation;
    List<Model> models;
    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
    public void displayModels(){
        models.stream()
                .map(model -> "Model "+  model.name + "producton year: "+ model.productionStartYear)
                .forEach(System.out::println);
    }

    public void displayEvenYearModels(){
        models.stream()
                .filter(model -> model.productionStartYear % 2 == 0)
                .map(model -> model.name)
                .forEach(System.out::println);
    }
}
