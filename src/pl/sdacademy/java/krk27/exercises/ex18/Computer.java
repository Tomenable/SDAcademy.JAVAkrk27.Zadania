package pl.sdacademy.java.krk27.exercises.ex18;

import java.util.Objects;

public class Computer {
    private String procesor;
    private int ram;
    private String kartaGrafiki;
    private String firma;
    private String model;

    public Computer(String procesor, int ram, String kartaGrafiki, String firma, String model) {
        this.procesor = procesor;
        this.ram = ram;
        this.kartaGrafiki = kartaGrafiki;
        this.firma = firma;
        this.model = model;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getKartaGrafiki() {
        return kartaGrafiki;
    }

    public void setKartaGrafiki(String kartaGrafiki) {
        this.kartaGrafiki = kartaGrafiki;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram=" + ram +
                ", kartaGrafiki='" + kartaGrafiki + '\'' +
                ", firma='" + firma + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                Objects.equals(procesor, computer.procesor) &&
                Objects.equals(kartaGrafiki, computer.kartaGrafiki) &&
                Objects.equals(firma, computer.firma) &&
                Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, ram, kartaGrafiki, firma, model);
    }
}
