package pl.sdacademy.java.krk27.exercises.ex17;

import java.util.function.Predicate;

public enum Converter {

    METERS_IN_YARDS(0.9144),
    YARDS_IN_METERS(1.0936133),
    CENTIMETERS_IN_INCHES(2.54),
    INCHES_IN_CENTIMETERS(0.393700787),
    KILOMETERS_IN_MILES(0.621371192),
    MILES_IN_KILOMETERS(1.609344);

    private double ratio;

    Converter(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
