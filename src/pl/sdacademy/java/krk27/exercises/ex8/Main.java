package pl.sdacademy.java.krk27.exercises.ex8;

public class Main {
    public static void main(String[] args) {
    Parcel paczka = new Parcel(45,50,32,18,true);
    Validator validate = new Validator();
        System.out.println("validate.validate(paczka) = " + validate.validate(paczka));

    }

}
