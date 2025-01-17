package example;


import utils.Logger;

import java.time.format.DateTimeFormatter;

public class Book implements Printable,Logger {

    String name;
    String author;
    private DateTimeFormatter formatter;

    public Book(String name, String author){

        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }

    @Override
    public void log() {

    }
}
