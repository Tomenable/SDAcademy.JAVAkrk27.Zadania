package pl.sdacademy.java.krk27.exercises.ex26b;

import java.util.List;

public class Model {
    public String name;
    public int productionStartYear;
    List<Car> cars;
    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public void display(){
        cars.stream()
                .map(car -> "Model name" + car.name + " car type: " + car.carType + ". ")
                .forEach(System.out::println);
    }
}
