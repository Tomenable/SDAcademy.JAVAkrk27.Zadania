package pl.sdacademy.java.krk27.exercises.ex32;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import pl.sdacademy.java.krk27.exercises.ex18.Computer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
        Gson gson = new Gson();

        ArrayList<Computer>list = new ArrayList<>();
        list.add(new Computer("Intel", 2048, "Ati", "Compaq","Armada"));
        list.add(new Computer("Intel", 1024, "Nvidia", "Lenovo","Armada"));

        Path path = Paths.get("Computers.txt");
        String json = gson.toJson(list);
        try {
            Files.writeString(path,json, StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.printStackTrace();
        }
        json = null;

        try {
            json = Files.readString(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Computer> lista = gson.fromJson(json, new TypeToken<List<Computer>>() {
        }.getType());


    }
}
