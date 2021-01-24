package pl.sdacademy.java.krk27.exercises.ex13;

import pl.sdacademy.java.krk27.exercises.ex12.Car;
import pl.sdacademy.java.krk27.exercises.ex12.Engine;
import pl.sdacademy.java.krk27.exercises.ex12.Manufacturer;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Manufacturer manufacturer = new Manufacturer("WAG", 1920, "Niemcy");
        Manufacturer manufacturer2 = new Manufacturer("TOYOTA", 1930, "Japonia");
        Manufacturer manufacturer3 = new Manufacturer("FIAT", 1910, "Włochy");
        Manufacturer manufacturer4 = new Manufacturer("SKODA", 1910, "Czechy");
        Manufacturer manufacturer5 = new Manufacturer("FORD", 1910, "Francja");


        Car car = new Car("Audi", "A6", 100000, 2000, List.of(manufacturer), Engine.R4);
        Car car2 = new Car("Audi", "S6", 300000, 2010, List.of(manufacturer), Engine.V8);
        Car car3 = new Car("Audi", "A8", 400000, 1995, List.of(manufacturer, manufacturer2), Engine.V12);
        Car car4 = new Car("Toyota", "Yaris", 80000, 2012, List.of(manufacturer2), Engine.R3);
        Car car5 = new Car("Toyota", "Yaris", 100000, 2017, List.of(manufacturer2), Engine.V6);
        Car car6 = new Car("Toyota", "Yaris", 60000, 1995, List.of(manufacturer2,manufacturer4, manufacturer5, manufacturer3), Engine.R5);
        Car car7 = new Car("Fiat", "Bravo", 80000, 2010, List.of(manufacturer3), Engine.R5);
        Car car8 = new Car("Fiat", "Punto", 60000, 2013, List.of(manufacturer3), Engine.R5);
        Car car9 = new Car("Ferrari", "F40", 1000000, 1984, List.of(manufacturer3, manufacturer2, manufacturer4, manufacturer), Engine.V12);

        CarService carService = new CarService(List.of(car,car2,car3,car4,car5,car6,car7,car8));
        System.out.println("carService.getCarList().size() = " + carService.getCarList().size());
        carService.addCar(car9);
        System.out.println("carService.getCarList().size() = " + carService.getCarList().size());
        carService.removaCar(car4);
        System.out.println("carService.getCarList().size() = " + carService.getCarList().size());
        System.out.println("carService.getCarV12().size() = " + carService.getCarV12().size());
        System.out.println("carService.before1999().size() = " + carService.before1999().size());
        System.out.println("carService.getCheapestCar() = " + carService.getCheapestCar());
        System.out.println("carService.getMostExpensiveCar() = " + carService.getMostExpensiveCar());

        System.out.println("carService.getCarWithThreeOrMoreManufacturers() = " + carService.getCarWithThreeOrMoreManufacturers());
        carService.removaCar(car6);
        carService.removaCar(car9);
        System.out.println("carService.getCarWithThreeOrMoreManufacturers() = " + carService.getCarWithThreeOrMoreManufacturers());


    }

}
