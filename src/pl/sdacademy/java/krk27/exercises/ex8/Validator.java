package pl.sdacademy.java.krk27.exercises.ex8;

public class Validator implements IValidator {
    private final static int MAX_SIZE = 30;
    private final static int MAX_DIMENSIONS_SUM = 300;
    private final static int MAX_WEIGHT = 30;
    private final static int MAX_EXPRESS_WEIGHT = 15;


    @Override
    public boolean validate(Parcel input) {

        boolean condition1 = input.getxLenght() + input.getyLenght() + input.getzLenght() <= MAX_DIMENSIONS_SUM;
        boolean condition2 = input.getxLenght() >= MAX_SIZE && input.getyLenght() >= MAX_SIZE && input.getzLenght() >= MAX_SIZE;
        boolean condition3 = input.getWeight() <= (input.isExpress() ?  MAX_EXPRESS_WEIGHT : MAX_WEIGHT);

        return condition1 && condition2 && condition3;
    }
}
