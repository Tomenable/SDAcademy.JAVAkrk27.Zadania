package pl.sdacademy.java.krk27.exercises.ex26b;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Manufacturer> manufacturersList = new ArrayList<>();
        List<Model> modelsList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();

        var carStream = manufacturersList.stream()
                .filter(manufacturer -> manufacturer.yearOfCreation % 2 == 0)
                .flatMap(manufacturer -> manufacturer.models.stream())
                .flatMap(models -> models.cars.stream())
                .collect(Collectors.toList());


    }

}
