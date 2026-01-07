package com.example.petshop;
import java.util.Date;

// an abstract Pet means we cannot create just a Pet object; we must create a "real" instance of a
// pet subclass such as Cat.
// Think "what is a pet"
public abstract class Pet {
    // all attributes should be private for data protection; should use getters and setters r/w
    private String name;
    private Date birthDate;

    // constructor method == init method
    public Pet(String name) {
        this.name = name; // same as self.name = name in Python
        this.birthDate = new Date();
    }

    // another constructor for if we want to create a new Pet with both a name and birthdate
    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // RMB -> Generate -> Getters and Setters to automatically create
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    // declaring a function that is the responsibility of a subclass to create (hence the abstract)
    // returns a String
    public abstract String speak();
}
