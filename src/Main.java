import com.alura.screenmatch.calculos.Recomendations;
import com.alura.screenmatch.calculos.TimeCalculator;
import com.alura.screenmatch.modelos.Episodes;
import com.alura.screenmatch.modelos.Film;
import com.alura.screenmatch.modelos.Series;

public class Main {
    static void main(String[] args) {
        Film myFilm1 = new Film();
        myFilm1.setName("Poderoso Chefão");
        myFilm1.setYearOfRelease(1972);
        myFilm1.setFilmLengthMinute(175);

        myFilm1.showAnalytics();
        myFilm1.rate(8);
        myFilm1.rate(6);
        myFilm1.rate(10);
        System.out.println("total de avaliações: " + myFilm1.getAllRatings());
        System.out.println(myFilm1.obtainRatingAvarage());

        Series serie1 = new Series();
        serie1.setName("Lost");
        serie1.setYearOfRelease(2004);
        serie1.showAnalytics();
        serie1.setSeason(10);
        serie1.setEpisodesPerSeason(10);
        serie1.setMinutePerEpisode(50);
        serie1.rate(4);
        serie1.rate(4);
        System.out.println("Duração da série: " + serie1.getFilmLength() + " minutos.");

        Film myFilm2 = new Film();
        myFilm2.setName("Avatar");
        myFilm2.setYearOfRelease(2023);
        myFilm2.setFilmLengthMinute(200);

        //Calculadora de tempo para lista de filmes
        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm1);
        calculator.include(myFilm2);
        calculator.include(serie1);
        System.out.println(calculator.getTotalTime());

        Recomendations filtro = new Recomendations();
        filtro.filter(myFilm1);

        Episodes episode = new Episodes();
        episode.setEpisodeNumber(1);
        episode.setSerie(serie1);
        episode.setTotalViews(300);
        filtro.filter(episode);

    }
}
