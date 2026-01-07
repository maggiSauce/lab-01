package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet {
    public Scorpion(String name) {
        super(name);    // super() calls the parent class' function with the matching name
    }

    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    // @Override: this is a fn decorator; clarifies that somewhere (in the superclass) there is a
    // function that needs to be overridden by this one
    @Override
    public String speak() {
        return "hiss";
    }
}
