package com.alura.screenmatch.calculos;

import com.alura.screenmatch.modelos.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

/*
 public void include(Film f) {
 totalTime += f.getFilmLength();
 }

 public void include(Series s) {
 totalTime += s.getFilmLength();
 }
 */

    public void include(Title title) {
        this.totalTime += title.getFilmLength();

    }


}
