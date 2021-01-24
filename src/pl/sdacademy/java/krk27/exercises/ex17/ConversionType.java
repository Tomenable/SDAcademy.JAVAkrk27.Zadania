package pl.sdacademy.java.krk27.exercises.ex17;

public enum ConversionType {

    METERS_TO_YARDS(Converter.YARDS_IN_METERS),
    YARDS_TO_METERS(Converter.YARDS_IN_METERS),
    CENTIMETERS_TO_INCHES(Converter.CENTIMETERS_IN_INCHES),
    INCHES_TO_CENTIMETERS(Converter.INCHES_IN_CENTIMETERS),
    KILOMETERS_TO_MILES(Converter.KILOMETERS_IN_MILES),
    MILES_TO_KILOMETERS(Converter.MILES_IN_KILOMETERS);

    private Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return converter;
    }
}
