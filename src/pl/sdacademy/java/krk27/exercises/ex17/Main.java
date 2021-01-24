package pl.sdacademy.java.krk27.exercises.ex17;

public class Main {

    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();

        double inches = measurementConverter.convert(10, ConversionType.CENTIMETERS_TO_INCHES);

        System.out.println("inches = " + inches);
    }
}
