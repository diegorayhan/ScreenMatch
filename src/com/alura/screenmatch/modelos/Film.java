package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Classify;

public class Film extends Title implements Classify {
    private String director;

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

}
