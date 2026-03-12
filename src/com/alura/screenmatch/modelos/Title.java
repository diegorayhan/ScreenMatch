package com.alura.screenmatch.modelos;

public class Title {
    private String name;
    private int yearOfRelease;
    private boolean planIncluded;
    private double addUpRatings;
    private int allRatings;
    private int filmLengthMinute;

    public int getAllRatings() {
        return allRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setFilmLengthMinute(int filmLengthMinute) {
        this.filmLengthMinute = filmLengthMinute;
    }

    public int getFilmLength(){
        return filmLengthMinute;
    }

    public void showAnalytics(){
        System.out.println("Nome do Filme: " + name);
        System.out.println("Ano de Lançamento: " + yearOfRelease);
    }

    public void rate(double userRate){
        addUpRatings += userRate;
        allRatings++;

    }

    public double obtainRatingAvarage(){
        return addUpRatings / allRatings;
    }
}

