package pl.sdacademy.java.krk27.exercises.ex27;

import java.util.Arrays;

public class Joiner <T>{

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String getSeparator() {
        return separator;
    }
    public String join (T... add){
        StringBuilder sb = new StringBuilder(add[0].toString());
        for(int i = 1; i < add.length; i++){
            sb.append(this.separator);
            sb.append(add[i].toString());
        }
        return sb.toString();
    }

    public String joinStream(T... add){
        StringBuilder sb = new StringBuilder(add[0].toString());
       Arrays.stream(add).skip(1).map(s -> separator + s.toString())
                .forEach(sb::append);
       return sb.toString();
    }
}
