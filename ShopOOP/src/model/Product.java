package model;

import java.security.PublicKey;
import java.security.SecureRandom;

public class Product {
    public static int counterProducts = 0;
    private String name;
    private int position;
    private int count;

//    {
//        counterProducts++;
//    }

    public Product(String name, int position, int count) {
        this.name = name;
        this.position = position;
        this.count = count;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }



    public void addOne(){
        this.count++;
    }

    public void removeOne(){
        if (this.count > 0)
            this.count--;
    }

    @Override
    public String toString() {
        return"Product (" + "name = " + name + ", position = " + position + ", quantity = " + count + ')';
    }
}
