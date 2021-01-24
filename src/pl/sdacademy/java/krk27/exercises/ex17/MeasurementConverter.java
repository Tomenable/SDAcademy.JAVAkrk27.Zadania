package pl.sdacademy.java.krk27.exercises.ex17;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType){
        return value*conversionType.getConverter().getRatio();
    }
}
