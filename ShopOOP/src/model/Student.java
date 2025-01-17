package model;

import main.Main;

import static java.lang.System.currentTimeMillis;

// школьник
public class Student extends User{
    private String education;

    public Student(int id, String country, int age, String username, String education) {
        super(id, country, age, username);
        this.education = education;
    }

    @Override
    public int getAge() {
        if (super.getAge() > 18) {
            System.out.println("\n Студент. Username: " + super.getUsername());
            return super.getAge();
        } else {
            System.out.println("\n Школьник. Username: " + super.getUsername());
            return super.getAge();
        }
    }

    @Override
    public String getPass() {
        Main.logger.log();
        return "\nUsername: " + this.getUsername()
                + "\nCountry: " + this.getCountry()
                + "\nAge: " + this.getAge()
                + "\nEducation: " + this.getEducation();
    }

    public String getEducation() {
        return education;
    }
}
