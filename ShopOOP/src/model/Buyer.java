package model;

import main.Main;
import service.Storage;

public class Buyer extends User {
    private String cardNumber;
    private String address;

    public Buyer(int id, String country, int age, String username, String address) {
        super(id, country, age, username);
        this.address = address;
    }

    @Override
    public int getAge() {
        if (super.getAge() < 0) {
            System.out.println("\n Возраст меньше 0 не допустим. Username: " + super.getUsername());
            return 1;
        } else return super.getAge();
    }

    @Override
    public String getPass() {
        Main.logger.log();
        return "\nUsername: " + this.getUsername()
                + "\nCountry: " + this.getCountry()
                + "\nAge: " + this.getAge()
                + "\nAddress: " +this.getAddress();
    }

    public Order buyProduct(String cardNumber, Product productForBuy, Product[] products, Storage storage) {
        // TODO
//        switch (storage.buyProducts(products, productForBuy)) {
//            case 0:
//                System.out.println("Покупка прошла успешно");
//            case 1:
//                System.out.println("Продукт на складе закончился");
//        }

        return new Order(getAddress(), this);
    }

    public String getAddress() {
        return address;
    }


}
