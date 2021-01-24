package pl.sdacademy.java.krk27.exercises.ex13;

import pl.sdacademy.java.krk27.exercises.ex12.Car;
import pl.sdacademy.java.krk27.exercises.ex12.Engine;
import pl.sdacademy.java.krk27.exercises.ex12.Manufacturer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> listaSamochodow;

    public CarService() {
        listaSamochodow = new ArrayList<>();
    }

    public CarService(List<Car> car) {
        listaSamochodow = new ArrayList<>(car);
    }

    public void addCar(Car toAdd) {
        if (!listaSamochodow.contains(toAdd)) {
            listaSamochodow.add(toAdd);
        }
    }

    public void removaCar(Car toRemove) {
        listaSamochodow.remove(toRemove);
    }

    public List<Car> getCarList() {
        return new ArrayList<>(listaSamochodow);
    }

    public List<Car> getCarV12() {
        return listaSamochodow.stream().filter(s -> s.getTypSilnika().equals(Engine.V12)).collect(Collectors.toList());
    }

    public List<Car> before1999() {
        return listaSamochodow.stream()
                .filter(car -> car.getRokProdukcji() < 1999)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return getCheapestOrMostExpensiveCar(false);
    }

    public Car getCheapestCar() {
        return getCheapestOrMostExpensiveCar(true);
    }

    private Car getCheapestOrMostExpensiveCar(boolean cheapest) {
        Optional<Car> car = listaSamochodow.stream()
                .sorted(Comparator.comparing(Car::getCena, cheapest ? Comparator.naturalOrder() : Comparator.reverseOrder()))
                .findFirst();
        return car.isPresent() ? car.get() : null;
    }

    public Car getCarWithThreeOrMoreManufacturers() {
        var car1 = listaSamochodow.stream()
                .filter(car -> car.getListaProducentow().size() >= 3)
                .findFirst();
        return car1.isPresent() ? car1.get() : null;
    }

    public List<Car> getSortedCars(SortOrder sortOrder) {
        return listaSamochodow.stream()
                .sorted(Comparator.comparing(Car::hashCode, sortOrder.comparator))
                .collect(Collectors.toList());
    }

    public boolean isCarOnList(Car car) {
        return listaSamochodow.contains(car);
    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return listaSamochodow.stream()
                .filter(car -> car.getListaProducentow().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByYearOfProductionBefore(String exp, int year) {
        Predicate<Car> predicate;
        switch (exp){
            case "<": predicate = car -> car.getRokProdukcji()<year;break;
            case "<=": predicate = car -> car.getRokProdukcji()<=year;break;
            case ">": predicate = car -> car.getRokProdukcji()>year;break;
            case ">=": predicate = car -> car.getRokProdukcji()>=year;break;
            case "!=": predicate = car -> car.getRokProdukcji()!=year;break;
            case "=": predicate = car -> car.getRokProdukcji()==year;break;
            default: predicate = car -> false;
        }
        return listaSamochodow.stream().filter(predicate)
                .collect(Collectors.toList());
    }

    enum SortOrder {
        NATURAL(Comparator.naturalOrder()),
        REVERSED(Comparator.reverseOrder());

        private Comparator<Integer> comparator;

        SortOrder(Comparator comparator) {
            this.comparator = comparator;
        }
    }




}

