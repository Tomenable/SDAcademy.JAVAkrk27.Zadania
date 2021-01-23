package pl.sdacademy.java.krk27.exercises.ex12;

import java.util.List;
import java.util.Objects;

public class Car {
    private String nazwa;
    private String model;
    private double cena;
    private int rokProdukcji;
    private List<Manufacturer> listaProducentow;
    private Engine typSilnika;

    public Car(String nazwa, String model, double cena, int rokProdukcji, List<Manufacturer> listaProducentow, Engine typSilnika) {
        this.nazwa = nazwa;
        this.model = model;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
        this.listaProducentow = listaProducentow;
        this.typSilnika = typSilnika;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.cena, cena) == 0 &&
                rokProdukcji == car.rokProdukcji &&
                Objects.equals(nazwa, car.nazwa) &&
                Objects.equals(model, car.model) &&
                Objects.equals(listaProducentow, car.listaProducentow) &&
                typSilnika == car.typSilnika;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, model, cena, rokProdukcji, listaProducentow, typSilnika);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public List<Manufacturer> getListaProducentow() {
        return listaProducentow;
    }

    public Engine getTypSilnika() {
        return typSilnika;
    }

    public void setTypSilnika(Engine typSilnika) {
        this.typSilnika = typSilnika;
    }
}
