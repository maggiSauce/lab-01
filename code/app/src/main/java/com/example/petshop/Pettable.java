package com.example.petshop;

public interface Pettable {
    // in this case "pet" is the action of petting an animal
    // says certain classes will have the pet class (ie are pettable)
    // in this case, Scorpion will not be implementing pet()
    public void pet();
}
