package com.example.petshop;
import java.util.Date;

// creating a subclass called "Cat" of the Pet class
// all methods in the Superclass are inherited by this child class
public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);    // super() calls the parent class' function with the matching name
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    // @Override: this is a fn decorator; clarifies that somewhere (in the superclass) there is a
    // function that needs to be overridden by this one
    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {

    }
}
