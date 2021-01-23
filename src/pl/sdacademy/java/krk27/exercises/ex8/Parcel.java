package pl.sdacademy.java.krk27.exercises.ex8;

public class Parcel {
    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLenght, int yLenght, int zLenght, float weight, boolean isExpress) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.isExpress = isExpress;

    }

    public int getxLenght() {
        return xLenght;
    }

    public int getyLenght() {
        return yLenght;
    }

    public int getzLenght() {
        return zLenght;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }
}
