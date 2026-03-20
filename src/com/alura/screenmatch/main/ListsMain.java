package com.alura.screenmatch.main;

import com.alura.screenmatch.modelos.Film;
import com.alura.screenmatch.modelos.Series;
import com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListsMain {
    static void main() {
        Film myFilm1 = new Film("Poderoso Chefão", 1972);
        myFilm1.rate(10);
        myFilm1.rate(8);
        Film myFilm2 = new Film("Avatar", 2023);
        myFilm2.rate(6);
        myFilm2.rate(8);
        var myFilm3 = new Film("Ponyo", 2018);
        myFilm3.rate(10);
        myFilm3.rate(9);
        Series serie1 = new Series("Lost", 2004);

        Film f1 = myFilm1;



        //Import of the title superclass for list to accept objects from more than one class, those being attached to Title
        ArrayList<Title> list = new ArrayList<>();
        list.add(myFilm3);
        list.add(myFilm2);
        list.add(myFilm1);
        list.add(serie1);
        //foreach comand is ITER, not foreach
        for (Title item : list) {
            System.out.println(item.getName());
            /*
            type cast / the getClassify method is only available on the Film class, so I convert the Title array to a Film array,
             making it so the items on the array can be added both as films and series but treated like films
            */
            if (item instanceof Film film && film.getClassify() > 2) {
                System.out.println("Classificação: " + film.getClassify());
            }
            /*
            Film film = (Film)item;
            System.out.println("Classificação: " + film.getClassify());
             */
        }

        ArrayList<String> artistSearch = new ArrayList<>();
        artistSearch.add("Adam Sandler");
        artistSearch.add("Daniel Radcliffe");
        artistSearch.add("Christian Bale");
        //sorting function for Strings only
        Collections.sort(artistSearch);
        System.out.println(artistSearch);

        Collections.sort(list);
        System.out.println("Lista ordenada alfabeticamente: \n" + list);
        list.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println("Lista ordenada por ano \n" + list);

    }
}
