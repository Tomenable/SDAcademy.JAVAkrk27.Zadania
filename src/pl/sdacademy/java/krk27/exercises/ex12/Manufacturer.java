package pl.sdacademy.java.krk27.exercises.ex12;

import java.util.Objects;

public class Manufacturer {
    private String nazwa;
    private int rokZalozenia;
    private String kraj;

    public Manufacturer(String nazwa, int rokZalozenia, String kraj) {
        this.nazwa = nazwa;
        this.rokZalozenia = rokZalozenia;
        this.kraj = kraj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return rokZalozenia == that.rokZalozenia &&
                Objects.equals(nazwa, that.nazwa) &&
                Objects.equals(kraj, that.kraj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, rokZalozenia, kraj);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRokZalozenia() {
        return rokZalozenia;
    }

    public void setRokZalozenia(int rokZalozenia) {
        this.rokZalozenia = rokZalozenia;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }
}
