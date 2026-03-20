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
 below is shown an example of polimorphism, taking away the need to write two diferent methods for series and films, using
 the Title class which contains all above
 */

    public void include(Title title) {
        this.totalTime += title.getFilmLength();

    }


}
