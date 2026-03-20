package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Classify;

public class Film extends Title implements Classify {
    private String director;

    //changes how setting the Film name goes. cannot leave Film example = new Film(); on blank. need to input its
    //respective name AND year of release for it to work.
    public Film(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassify() {
        return (int) obtainRatingAvarage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearOfRelease() + ")";
    }
}
