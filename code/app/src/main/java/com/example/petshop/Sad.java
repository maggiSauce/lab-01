package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    public Sad(Date moodDate) {
        super(moodDate);
    }

    @Override
    public String displayMood() {
        return "I am sad :(";
    }
}
