package model;

public class Child extends Buyer{
    public Child(int id, String country, int age, String username, String address) {
        super(id, country, age, username, address);
    }

    @Override
    public int getAge() {
        return 5;
    }

    @Override
    public String getPass() {
        return super.getPass();
    }

}
