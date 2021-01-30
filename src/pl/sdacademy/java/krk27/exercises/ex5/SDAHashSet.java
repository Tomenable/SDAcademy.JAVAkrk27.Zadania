package pl.sdacademy.java.krk27.exercises.ex5;

/*Zaimplementuj klasę SDAHashSet<E> , która będzie implementować logikę HashSet<E>. W tym celu
zaimplementuj obsługę metod:
• add
• remove
• size
• contains
• clear
 */

import java.util.HashMap;

import java.util.Map;
import java.util.Set;

public class SDAHashSet<E> {
    private Map<E,Void> map;

    public SDAHashSet() {
        this.map = new HashMap<>();
    }

    public void add(E e) {
        if (!map.containsKey(e))
        map.put(e,null);
    }

    public void remove(E e) {
        map.remove(e);
    }

    public int size(){
        return map.size();
    }

    public boolean contains(E e) {
        return map.containsKey(e);
    }

    public void clear() {
        map.clear();
    }


}
