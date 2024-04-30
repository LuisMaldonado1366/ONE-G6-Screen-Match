import com.alura.screenmatch.calculators.TimestampCalculator;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie deadpool = new Movie();
        deadpool.setName("Deadpool");
        deadpool.setReleaseDate(2016);
        deadpool.setDurationInMinutes(108);
        deadpool.setMembershipIncluded(true);

        deadpool.displayMovieSpecs();
        deadpool.rateMovie(7.8);
        deadpool.rateMovie(10);
        System.out.printf("\nTotal ratings: %d", deadpool.getTotalRatings());
        System.out.printf("\nAverage rating: %.2f", deadpool.calculateMean());

        Serie houseOfDragon = new Serie();
        houseOfDragon.setName("House of Dragon");
        houseOfDragon.setReleaseDate(2022);
        houseOfDragon.setSeasons(1);
        houseOfDragon.setMinutesPerEpisode(50);
        houseOfDragon.setEpisodesPerSeason(10);
        houseOfDragon.displayMovieSpecs();

        Movie starWarsEp3 = new Movie();
        starWarsEp3.setName("Star Wars Episode 3: Revenge of the Sith");
        starWarsEp3.setReleaseDate(2005);
        starWarsEp3.setDurationInMinutes(140);
        starWarsEp3.setMembershipIncluded(false);

        starWarsEp3.displayMovieSpecs();

        TimestampCalculator calculator = new TimestampCalculator();
        calculator.mediaList(deadpool);
        calculator.mediaList(houseOfDragon);
        calculator.mediaList(starWarsEp3);
        System.out.printf("\n\nTotal time to finish list: %d minutes", calculator.getTotalTime());

    }
}
