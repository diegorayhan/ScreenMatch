package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Classify;

public class Episodes implements Classify {
    private int episodeNumber;
    //ex: ep 1, 2 , 3
    private String name;
    private Series serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    @Override
    public int getClassify() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2; }
    }
}
