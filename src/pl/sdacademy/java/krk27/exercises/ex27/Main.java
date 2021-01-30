package pl.sdacademy.java.krk27.exercises.ex27;

public class Main {
    public static void main(String[] args) {
        Joiner<String> joiner = new Joiner<>("-");
        System.out.println(joiner.join("kasia", "gosia", "tomek", "kamil"));
        System.out.println(joiner.joinStream("kasia", "gosia", "tomek", "kamil"));

    }
}
