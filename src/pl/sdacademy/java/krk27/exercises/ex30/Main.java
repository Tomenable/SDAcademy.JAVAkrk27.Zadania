package pl.sdacademy.java.krk27.exercises.ex30;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Path inputPath = Paths.get("src/pl/sdacademy/java/krk27/exercises/ex30/text.txt");
            String lines = Files.readString(inputPath);
            String restult = reverseString(lines);
            Path outputPath = Path.of(inputPath.getParent().toString(), reverseString(inputPath.getFileName().toString().split("\\.")[0]) + "." + inputPath.getFileName().toString().split("\\.")[1]);
            Files.writeString(outputPath,restult );


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String reverseString(String string){
        StringBuilder toReverse = new StringBuilder(string);
        return toReverse.reverse().toString();
    }
}
