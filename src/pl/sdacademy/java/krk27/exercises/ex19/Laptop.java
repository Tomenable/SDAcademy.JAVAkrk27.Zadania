package pl.sdacademy.java.krk27.exercises.ex19;

import pl.sdacademy.java.krk27.exercises.ex18.Computer;

import java.util.Objects;

public class Laptop extends Computer {
    private int bateria;

    public Laptop(String procesor, int ram, String kartaGrafiki, String firma, String model, int bateria) {
        super(procesor, ram, kartaGrafiki, firma, model);
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "bateria=" + bateria +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return bateria == laptop.bateria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bateria);
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
