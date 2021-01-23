package pl.sdacademy.java.krk27.exercises.ex7;

import java.util.Stack;

public class Magazine {

    private int size;
    private Stack<String> magazine;

    public Magazine(int size) {
        this.size = size;
        this.magazine = new Stack<>();
    }

    public void loadBullet(String bullet){
        if(magazine.size()<size){
            magazine.add(bullet);
        }
    }

    public boolean isLoaded(){
        return magazine.size()>0;
    }

    public void shot(){
        if(isLoaded()){
            System.out.println(magazine.pop());
        }else{
            System.out.println("Empty magazine");
        }
    }


}
