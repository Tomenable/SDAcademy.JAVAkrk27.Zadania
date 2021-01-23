package pl.sdacademy.java.krk27.exercises.ex13;

import pl.sdacademy.java.krk27.exercises.ex12.Car;
import pl.sdacademy.java.krk27.exercises.ex12.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> listaSamochodow;

    public CarService() {
        listaSamochodow = new ArrayList<>();
    }
    public void addCar(Car toAdd){
        if (!listaSamochodow.contains(toAdd)) {
            listaSamochodow.add(toAdd);
        }
    }
    public void removaCar(Car toRemove){
        listaSamochodow.remove(toRemove);
    }
    public List<Car> getCarList(){
        return new ArrayList<>(listaSamochodow);
    }
    public List<Car> getCarV12(){
        return listaSamochodow.stream().filter( s -> s.getTypSilnika().equals(Engine.V12)).collect(Collectors.toList());
    }

}
