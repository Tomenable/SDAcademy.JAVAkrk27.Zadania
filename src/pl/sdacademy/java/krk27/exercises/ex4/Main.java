package pl.sdacademy.java.krk27.exercises.ex4;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.addToStorage("Letters", "Abc");
        storage.addToStorage("Letters", "bbbb");
        storage.addToStorage("Letters", "ccccc");
        storage.addToStorage("Numbers", "1");
        storage.addToStorage("Numbers", "2");
        storage.addToStorage("Numbers", "3");
        storage.addToStorage("Mix", "Abc");
        storage.addToStorage("Mix", "bbbb");
        storage.addToStorage("Mix", "3");

        storage.printValues("Numbers");
        storage.findValues("bbbb");
    }
}
