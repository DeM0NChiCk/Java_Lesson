package model;


public abstract class User {

    private int id;
    private String username;
    private String country;
    private int age;


    public User(int id, String country, int age, String username) {
        this.id = id;
        this.username = username;
        this.country = country;
        this.age = age;
    }

    public User(int id, String country, int age) {
        this.id = id;
        this.username = "Moderator";
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getCountry() {
        return country;
    }

    public abstract String getPass();

    @Override
    public String toString() {
        return getClass().getName() + " " + getUsername() + " " + getCountry() + " " + getAge() + " " + getId();
    }

    //    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}

