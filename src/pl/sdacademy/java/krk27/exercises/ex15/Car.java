package pl.sdacademy.java.krk27.exercises.ex15;

public enum Car {

    FERRARI(100, 100000.00f,100),
    FIAT( 600, 600000, 600),
    OPEL(500, 500000,500),
    BMW(400, 400000, 400),
    MERCEDES(300, 300000,300),
    PORSCHE(200, 200000,200);

    private int power;
    private float price;
    private int maxSpeed;


    Car(int power, float price, int maxSpeed) {
        this.power = power;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public boolean isRegular(){
        return price > 450000;
    }

    public boolean isPremium(){
        return !isRegular();
    }

    public boolean isFasterThan(Car car){
        return compareTo(car) > 0;
    }
}
