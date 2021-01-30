package pl.sdacademy.java.krk27.exercises.zad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.copyOf;

public class Basket {
    Map<Product, Integer> products = new HashMap<>();

    public void addToBasket(Product product){
        if(products.containsKey(product))
        {
            products.replace(product, products.get(product) + 1);
        }else{
            products.put(product, 1);
        }
    }

    public void removeFromBasket(Product product)
    {
        if(products.get(product) > 1){
            products.replace(product, products.get(product) - 1);
        } else {
            products.remove(product);

        }
    }

    public Map<Product, Integer> getBasket() {
        return Map.copyOf(products);
    }
}
