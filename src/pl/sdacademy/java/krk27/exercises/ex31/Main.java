package pl.sdacademy.java.krk27.exercises.ex31;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /*
    Napisz program, który policzy wystąpienia każdego słowa w pliku tekstowym a następnie wyniki zapisze w
formie tabelki w nowym pliku.
     */

    public static void main(String[] args) {

        try {
            Path path = Paths.get("src/pl/sdacademy/java/krk27/exercises/ex31/file.txt");
            List<String> listOfString = Files.readAllLines(path);
            String collect = listOfString.stream()
                    .map(m -> m.split(" "))
                    .flatMap(f -> Arrays.stream(f))
                    .collect(Collectors.groupingBy(m -> m))
                    .entrySet().stream()
                    .map(m -> m.getKey() + "\t\t" + m.getValue().size())
                    .collect(Collectors.joining("\n"));
            System.out.println(collect);
            Path path1 = Paths.get("src/pl/sdacademy/java/krk27/exercises/ex31/fileResult.txt");
            Files.writeString(path1,collect, StandardOpenOption.CREATE);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
