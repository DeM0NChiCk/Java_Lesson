package example;

import utils.Logger;

public class Journal implements Printable, Logger {

    private String name;

    String getName(){
        return name;
    }

    public Journal(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public void log() {

    }
}
