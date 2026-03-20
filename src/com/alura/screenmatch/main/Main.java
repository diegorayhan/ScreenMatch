package com.alura.screenmatch.main;

import com.alura.screenmatch.calculos.Recomendations;
import com.alura.screenmatch.calculos.TimeCalculator;
import com.alura.screenmatch.modelos.Episodes;
import com.alura.screenmatch.modelos.Film;
import com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        //for this project, there will be a constructor method AND a setter method, for leaning practices
        Film myFilm1 = new Film("Poderoso Chefão", 1972);
        myFilm1.setFilmLengthMinute(175);

        myFilm1.showAnalytics();
        myFilm1.rate(8);
        myFilm1.rate(6);
        myFilm1.rate(10);
        System.out.println("total de avaliações: " + myFilm1.getAllRatings());
        System.out.println(myFilm1.obtainRatingAvarage());

        Series serie1 = new Series("Lost", 2004);
        serie1.showAnalytics();
        serie1.setSeason(10);
        serie1.setEpisodesPerSeason(10);
        serie1.setMinutePerEpisode(50);
        serie1.rate(4);
        serie1.rate(4);
        System.out.println("Duração da série: " + serie1.getFilmLength() + " minutos.");

        Film myFilm2 = new Film("Avatar", 2023);
        myFilm2.setFilmLengthMinute(200);

        //Calculadora de tempo para lista de filmes
        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm1);
        calculator.include(myFilm2);
        calculator.include(serie1);
        System.out.println("Tempo total da lista: " + calculator.getTotalTime());

        Recomendations filtro = new Recomendations();
        filtro.filter(myFilm1);

        Episodes episode = new Episodes();
        episode.setEpisodeNumber(1);
        episode.setSerie(serie1);
        episode.setTotalViews(300);
        filtro.filter(episode);

        var myFilm3 = new Film("Ponyo", 2018);
       // myFilm3.setName("Ponyo");
        myFilm3.setDirector("Studio Ghibli");
        myFilm3.setFilmLengthMinute(101);
        myFilm3.rate(10);

        ArrayList<Film> filmsList = new ArrayList<>();
        filmsList.add(myFilm3);
        filmsList.add(myFilm2);
        filmsList.add(myFilm1);
        filmsList.size();
        System.out.println("Tamanho da lista: " + filmsList.size());
        // Java initializes with zero
        System.out.println("Primeiro filme: " + filmsList.get(0).getName());
        System.out.println(filmsList);
        System.out.println("toString do filme | " + filmsList.get(0).toString());

    }
}
