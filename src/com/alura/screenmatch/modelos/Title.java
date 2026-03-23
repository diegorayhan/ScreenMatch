package com.alura.screenmatch.modelos;

import com.alura.screenmatch.exception.YearErrorConversionException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title> {
    private String name;
    private int yearOfRelease;
    private boolean planIncluded;
    private double addUpRatings;
    private int allRatings;
    private int filmLengthMinute;

    //comparable implementation for sorting
    //a constructor with only the FILM NAME parameter can also be made, in which, the year of release dosnt need to
    //be inserted

    public Title(String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public Title(OmdbTitle myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if (myTitleOmdb.year().length() > 4) {
            throw new YearErrorConversionException("Nao foi possivel converter o ano pela quantidade de caracteres");
        }
        this.yearOfRelease = Integer.valueOf(myTitleOmdb.year());
        this.filmLengthMinute = Integer.valueOf(myTitleOmdb.runtime()
                .substring(0,3));

    }

    public int getAllRatings() {
        return allRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
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

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return "Título do filme = " + name + "\n" +
                "Ano de lançamento = " + yearOfRelease + "\n" +
                "Duração em minutos= " + filmLengthMinute;
    }
}

